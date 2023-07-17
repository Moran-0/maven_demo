package com.moranAu.Service;

import com.moranAu.Pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuService {

    List<Student> selectStudentByStuNameServ(String stuName);


    Integer addStudentServ(Student student);

//    Integer updateScoreServ(Integer id, String gender);

    Integer updateStuServ(Student student);

    Integer deleteStudentByIdServ(Integer id);

    Integer loginServ(String uName, String password);
}
