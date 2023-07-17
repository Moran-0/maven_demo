package com.moran.Pojo;

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
    private String customerId;
    private String password;
    private String name;
    private LocalDateTime createTime;

}
