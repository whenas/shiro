package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by lusongjiong on 2018/12/10.
 */
@Getter
@Setter
@ToString
@TableName("t_permission")
public class Permission implements Serializable{
    private static final long serialVersionUID = 7160557680614732403L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * url地址
     */
    private String url;
    /**
     * url描述
     */
    private String name;
}
