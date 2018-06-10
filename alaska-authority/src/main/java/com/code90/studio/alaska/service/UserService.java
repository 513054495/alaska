package com.code90.studio.alaska.service;

import com.code90.studio.alaska.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户数据库服务接口
 * @author Ray
 * @create 2017-05-21 23:57
 */
public interface UserService extends CrudRepository<User,Integer> {
    @Query("select u from User u where u.id=?1 ")
    User getById(String id);
}
