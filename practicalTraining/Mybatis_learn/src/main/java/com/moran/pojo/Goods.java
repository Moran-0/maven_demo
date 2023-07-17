package com.moran.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String goodsExplain;
    private Integer goodsPrice;
    private Integer gtId;
    private GoodsType goodsType;
;
}
