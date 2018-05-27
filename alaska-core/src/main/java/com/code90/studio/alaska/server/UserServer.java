package com.code90.studio.alaska.server;

import com.code90.studio.alaska.domain.User;

import java.util.List;

/**
 * 用户服务类
 * @author Ray
 * @create 2018-05-28 0:14
 **/
public interface UserServer extends BaseServer {
    /**
     * 获取全部用户
     * @return 用户集合
     */
    List<User> getAll();

    /**
     * 保存/修改用户
     * @param user 用户信息
     */
    void save(User user);

    /**
     * 根据编号获取用户
     * @param id 编号
     * @return 用户信息
     */
    User getById(String id);

}
