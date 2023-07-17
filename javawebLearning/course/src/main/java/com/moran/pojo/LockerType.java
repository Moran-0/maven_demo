package com.moran.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LockerType {
    private String type;
    private Integer num;
    private Integer shopId;
}
