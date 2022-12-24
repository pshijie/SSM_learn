package com.psj.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//lombok
@Data
@TableName("tbl_user")
public class User {
    private Long id;
    private String name;
    @TableField(value = "pwd",select = false)
    private String password;
    private Integer age;  // 年龄的下限
    private String tel;
    @TableField(exist = false)
    private Integer online;
}
