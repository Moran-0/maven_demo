package com.moran.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dep1 {
    private String deptNo;
    private String depName;
    private String loc;
    private List<Emp1> emp1s;
}
