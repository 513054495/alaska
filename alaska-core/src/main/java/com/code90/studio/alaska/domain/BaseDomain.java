package com.code90.studio.alaska.domain;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体
 * @author Ray
 * @create 2018-05-28 0:14
 **/
@MappedSuperclass
public class BaseDomain implements Serializable {
    @Id
    @GenericGenerator(name="UUIDGENERATE",strategy="uuid2")
    @GeneratedValue(generator="UUIDGENERATE")
    @Column(name="ID",length=36)
    //编号
    public String id;
    @Column
    //版本号
    public int version;
    @Column(name = "create_by")
    @CreatedBy
    //创建人
    public Long createBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATE_TIME",updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    //创建时间
    public Date createTime;
    @Column(name="MODIFY_TIME")
    @org.hibernate.annotations.UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    //修改时间
    public Date modifyTime;
    @Column(name = "lastmodified_by")
    @LastModifiedBy
    //修改人
    public String lastmodifiedBy;
}
