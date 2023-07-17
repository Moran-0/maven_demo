package com.moran.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsType1 {
    private Integer gtId;
    private String gtName;
    private String gtExplain;
    private List<Goods1> goods1List;
}
