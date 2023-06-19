package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopLocker {
    private Integer modelId;
    private Integer shopId;
    private String shopName;
    private Integer num;
};
;
