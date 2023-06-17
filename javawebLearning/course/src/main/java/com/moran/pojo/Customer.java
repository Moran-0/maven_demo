package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Customer {
    private Integer id;
    private String customer_id;
    private String password;
    private String name;
    private LocalDateTime create_time;

}
