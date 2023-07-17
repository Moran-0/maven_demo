package com.moranAu.Mapper;

import com.moranAu.Pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StuMapper {

    List<Student> selectStudent();// no

    List<Student> selectStudentByStuName(String stuName);

    Student selectStudentById(Integer id);// no

    Integer addStudent(Student student);

//    Integer updateScore(Integer id, String gender);

    Integer updateScore(@Param("id") Integer id, @Param("score") Double score);

    Integer updateStu(Student student);

    Integer deleteStudentById(Integer id);

    Integer login(@Param("uName") String uName, @Param("password") String password);
}
