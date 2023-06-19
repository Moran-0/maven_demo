package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer orderId;
    private String customerId;
    private Integer lockerId;
    private Integer shopId;
    private LocalDateTime fromTime;
    private LocalDateTime toTime;
    private Double payTotal;
    private LocalDateTime orderTime;

}
