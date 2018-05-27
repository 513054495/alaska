package com.code90.studio.alaska.server.impl;

import com.code90.studio.alaska.domain.User;
import com.code90.studio.alaska.server.UserServer;
import com.code90.studio.alaska.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务实现类
 * @author Ray
 * @create 2017-05-21 23:57
 */
@Service("userServer")
public class UserServerImpl implements UserServer {
    @Autowired
    private UserService userService;

    @Override
    public List<User> getAll() {
        List<User> list =new ArrayList<>();
        Iterable<User> users= userService.findAll();
        for (User user : users){
            list.add(user);
        }
        return list;
    }

    @Override
    public void save(User user) {
        userService.save(user);
    }

    @Override
    public User getById(String id) {
        return userService.getById(id);
    }

}
