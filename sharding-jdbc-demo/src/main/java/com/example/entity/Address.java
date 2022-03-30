package com.example.entity;/**
 * @author linking
 * @date 2022-03-31 01:13
 */

import lombok.Data;

/**
 *@author linking
 *@date 2022/3/31
 */
@Data
public class Address {
    private Long id;
    private String code;
    private String name;
    private String pid;
    private Integer type;
    private Integer lit;
}
