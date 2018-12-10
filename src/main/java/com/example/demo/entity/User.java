package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lusongjiong on 2018/12/10.
 */
@Getter
@Setter
@ToString
@TableName("t_user")
public class User implements Serializable{
    private static final long serialVersionUID = -5440372534300871944L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 状态 是否有效 1：有效  0：锁定
     */
    private String status;
}
