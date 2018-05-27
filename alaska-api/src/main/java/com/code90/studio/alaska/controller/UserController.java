package com.code90.studio.alaska.controller;

import com.code90.studio.alaska.domain.User;
import com.code90.studio.alaska.request.UserChangeReq;
import com.code90.studio.alaska.request.UserSaveReq;
import com.code90.studio.alaska.response.CommonResponse;
import com.code90.studio.alaska.server.UserServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制类
 * @author Ray
 * @create 2018-05-28 0:14
 **/
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    private static final Logger logger=LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserServer userServer;

    /**
     * 获取全部用户接口
     * @return  全部用户信息
     */
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public CommonResponse getAll(){
        try{
            List<User> list=userServer.getAll();
            logger.info("用户获取成功");
            return new CommonResponse("获取成功","userList",list);
        }catch(Exception e){
            logger.error("保存失败，原因："+e.getMessage());
            return new CommonResponse("获取失败",1,e);
        }

    }

    /**
     * 保存用户接口
     * @param req 用户信息
     * @return  是否保存成功
     */
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public CommonResponse save(UserSaveReq req){
        try {
            User user=new User();
            BeanUtils.copyProperties(req,user);
            userServer.save(user);
            logger.info("用户保存成功");
            return new CommonResponse("保存成功");
        }catch (Exception e){
            logger.error("保存失败，原因："+e.getMessage());
            return new CommonResponse("保存失败",1,e);
        }
    }

    /**
     * 修改用户接口
     * @param req 修改信息
     * @return 是否修改成功
     */
    @RequestMapping(value="/update",method = RequestMethod.PUT)
    public CommonResponse update(UserChangeReq req){
        try {
            User user=userServer.getById(req.getId());
            user.setName(req.getName());
            userServer.save(user);
            logger.info("用户修改成功");
            return new CommonResponse("修改成功");
        }catch (Exception e){
            logger.error("修改失败，原因："+e.getMessage());
            return new CommonResponse("修改失败",2,e);
        }
    }
}
