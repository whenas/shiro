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
@TableName("t_role")
public class Role implements Serializable {
    private static final long serialVersionUID = -227437593919820521L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
    /**
     *角色描述
     */
    private String memo;
}
