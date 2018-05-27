package com.code90.studio.alaska.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户实体
 * @author Ray
 * @create 2018-05-28 0:14
 **/
@Entity
@Table(name = "sys_user")
public class User extends BaseDomain {

    private static final long serialVersionUID = -3113770074284679436L;

    @Column
    //用户名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
