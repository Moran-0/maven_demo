package com.moran.service;

import com.moran.mapper.DeptMapper;
import com.moran.Pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public Dept getDeptById(Integer deptno) {
        return deptMapper.getDeptById(deptno);
    }
}
