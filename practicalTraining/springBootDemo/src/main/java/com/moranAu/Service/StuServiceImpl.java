package com.moranAu.Service;

import com.moranAu.Mapper.StuMapper;
import com.moranAu.Pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;

    @Override
    public List<Student> selectStudentByStuNameServ(String stuName) {
        return stuMapper.selectStudentByStuName(stuName);
    }

    @Override
    public Integer addStudentServ(Student student) {
        student.setBirthdate(new Date());
        return stuMapper.addStudent(student);
    }

    @Override
    public Integer updateStuServ(Student student) {
        return stuMapper.updateStu(student);
    }

    @Override
    public Integer deleteStudentByIdServ(Integer id) {
        return stuMapper.deleteStudentById(id);
    }

    @Override
    public Integer loginServ(String uName, String password) {
        if (uName == null || uName == "" || password == null || password == "") return 0;
        return stuMapper.login(uName, password);
    }

}
