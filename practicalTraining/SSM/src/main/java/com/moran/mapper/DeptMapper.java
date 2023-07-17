package com.moran.mapper;

import com.moran.Pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
    public Dept getDeptById(Integer deptno);
}
