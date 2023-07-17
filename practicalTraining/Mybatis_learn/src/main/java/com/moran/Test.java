package com.moran;

import com.moran.mapper.Dep1Mapper;
import com.moran.mapper.EmpMapper;
import com.moran.mapper.StuMapper;
import com.moran.Pojo.Dep1;
import com.moran.Pojo.Emp;
import com.moran.Pojo.Student;
import com.moran.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;
import java.util.List;

@Slf4j
public class Test {
    private static StuMapper stuMapper;
    private static EmpMapper empMapper;
    private static Dep1Mapper dep1Mapper;
    private static SqlSession sqlSession;
    static {
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        stuMapper = sqlSession.getMapper(StuMapper.class);
        empMapper = sqlSession.getMapper(EmpMapper.class);
        dep1Mapper = sqlSession.getMapper(Dep1Mapper.class);
    }

    public static void main(String[] args) {
//        selectAll();
//        selectStudentById();
//        addStudent();
//        updateStudentScore();
//        deleteStudentById();
//        selectStudentByStuName();
//        selectEmp();
        selectDep();
    }

    private static void selectAll(){
        log.info("查询所有学生信息");
        List<Student> students = stuMapper.selectStudent();
        System.out.println(students);
    }
    private static void selectStudentById(){
        log.info("查询单个学生信息（id）");
        Student student = stuMapper.selectStudentById(1);
        System.out.println(student);
    }
    private static void addStudent(){
        log.info("添加学生");
        Student student = new Student();
        student.setUserName("Moran");
        student.setScore(99.99);
        student.setPassword("12346987");
        student.setGender("男");
        student.setStuName("风行绘");
        student.setBirthday(new Date());
        Integer total = stuMapper.addStudent(student);
        sqlSession.commit();//提交事务
        System.out.println(total);
    }

    private static void updateStudentScore(){
        Integer id = 12;
        Double score = 88.88;
        String gender = "女";
        log.info("更新学生成绩，参数:{},{}",id,score);
        Integer total = stuMapper.updateScore(id,score);
        sqlSession.commit();
        System.out.println(total);
    }
    private static void deleteStudentById(){
        log.info("删除学生");
        Integer total = stuMapper.deleteStudentById(10);
        sqlSession.commit();
        System.out.println(total);
    }
    private static void selectStudentByStuName(){
        String stuName = "宁";
        log.info("通过名字查询学生信息,参数：{}",stuName);
        List<Student> students = stuMapper.selectStudentByStuName(stuName);
        System.out.println(students);
    }

    private static void selectEmp(){
        log.info("关联查询dept和emp");
        List<Emp> emps = empMapper.selectAllEmp();
        System.out.println(emps);

    }
    private static void selectDep(){
        log.info("多对一关联查询");
        List<Dep1> dep1s = dep1Mapper.selectDep1(10);
        for (Dep1 dep : dep1s){
            System.out.println(dep.getDeptNo());
            System.out.println(dep.getDepName());
            System.out.println(dep.getLoc());
            System.out.println(dep.getEmp1s());
        }
//        System.out.println(dep1s);
    }
}
