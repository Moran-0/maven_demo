package com.moran.mapper;

import com.moran.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper {

    List<Student> selectStudent();

    List<Student> selectStudentByStuName(String stuName);

    Student selectStudentById(Integer id);

    Integer addStudent(Student student);

//    Integer updateScore(Integer id, String gender);

    Integer updateScore(@Param("id") Integer id, @Param("score") Double score);

    Integer deleteStudentById(Integer id);
}
