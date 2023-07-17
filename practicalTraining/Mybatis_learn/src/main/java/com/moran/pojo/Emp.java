package com.moran.Pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Emp {
    private Integer empNo;
    private String empName;
    private String job;
    private Integer mgr;//
    private String hireDate;
    private Double salary;
    private Double comm;
    private String deptNo;
    private Dep dep;//关联表多对一中的一所对应的实体类

    public Emp(Integer empNo, String empName, String job, Integer mgr, String hireDate, Double salary, Double comm, String deptNo){
        this.empNo = empNo;
        this.empName = empName;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.salary = salary;
        this.comm = comm;
        this.deptNo = deptNo;
    }

}
