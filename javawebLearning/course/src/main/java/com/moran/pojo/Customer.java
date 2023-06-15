package com.moran.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Customer {
    private Integer id;
    private String customer_id;
    private String password;
    private String name;
    private String create_time;

}
