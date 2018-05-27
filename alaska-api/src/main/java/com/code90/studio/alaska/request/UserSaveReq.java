package com.code90.studio.alaska.request;

/**
 * 用户保存请求类
 * @author Ray
 * @create 2018-05-28 0:14
 **/
public class UserSaveReq extends CommonRequest {
    //用户名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
