package com.example.entity;/**
 * @author linking
 * @date 2022-03-31 01:12
 */

import lombok.Data;

import java.util.Date;

/**
 * @author linking
 * @date 2022/3/31
 */
@Data
public class User {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private Integer cityId;
    private Date createTime;
    private Integer sex;

}
