package com.code90.studio.alaska.server;

import com.code90.studio.alaska.StartAuthorityApplication;
import com.code90.studio.alaska.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartAuthorityApplication.class)// 指定spring-boot的启动类
public class UserServerTest {

    @Autowired
    private UserServer userServer;

    @Test
    public void getAll() {
        List<User> users = userServer.getAll();
        Assert.assertEquals(users.get(1).getName(),"Tom");
    }
}