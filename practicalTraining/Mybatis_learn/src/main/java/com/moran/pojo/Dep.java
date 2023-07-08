package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dep {
    private String deptNo;
    private String depName;
    private String loc;
}
