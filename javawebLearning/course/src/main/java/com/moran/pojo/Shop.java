package com.moran.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private Integer id;
    private String name;
    private String province;
    private String city;
    private String district;
    private String address;
    private String tel;
    private String owner;
    private String status;
    private String ownerId;
    private LocalDateTime createTime;
}
