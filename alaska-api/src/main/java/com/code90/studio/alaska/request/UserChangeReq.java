package com.code90.studio.alaska.request;

/**
 * 用户修改请求类
 * @author Ray
 * @create 2018-05-28 0:14
 **/
public class UserChangeReq extends CommonRequest {
    //用户编号
    private String id;
    //用户名
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
