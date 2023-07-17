package com.moranAu.Mapper;

import com.moranAu.Pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> selectDept(@Param("deptNo") Integer deptNo,@Param("deptName") String deptName);
}
