package com.moran.controller;

import com.moran.Pojo.Dept;
import com.moran.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/getDeptById")
    public Dept getDeptById(Integer deptno) throws Exception{
        return deptService.getDeptById(deptno);
    }
}
