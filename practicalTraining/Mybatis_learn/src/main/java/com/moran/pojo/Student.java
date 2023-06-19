package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 通过lombok自动生成getter，setter，有参无参构造器
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String userName;
    private String password;
    private String stuName;
    private String gender;
    private Date birthday;
    private Double score;
}
