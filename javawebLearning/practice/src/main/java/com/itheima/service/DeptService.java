package com.itheima.service;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
    /**
     * 查询全部的部门信息
     * @return
     */
    public List<Dept> list();
}
