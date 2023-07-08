package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp1 {
    private Integer empNo;
    private String empName;
    private String job;
    private Integer mgr;//
    private String hireDate;
    private Double salary;
    private Double comm;
    private String deptNo;
}
