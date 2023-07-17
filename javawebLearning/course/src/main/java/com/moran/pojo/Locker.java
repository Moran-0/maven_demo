package com.moran.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Locker {
    private Integer id;
    private String modelId;
    private String type;
    private Integer shopId;
    private Double capacity;
    private Double length;
    private Double width;
    private Double high;
    private Double price;
    private String status;
}
