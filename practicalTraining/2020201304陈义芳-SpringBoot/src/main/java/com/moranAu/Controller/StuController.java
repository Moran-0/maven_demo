package com.moranAu.Controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moranAu.Pojo.Result;
import com.moranAu.Pojo.Student;
import com.moranAu.Service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private StuService stuService;
    @GetMapping("/select")
    public Result selectStuByName(String name){
        log.info("查询学生信息，参数：{}",name);
        try{
            List<Student> students = stuService.selectStudentByStuNameServ(name);
            return Result.success(students);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }

    @PostMapping("/add")
    public Result addStudent( Student student){
        log.info("添加学生信息，参数：{}",student);
        try{
            Integer total = stuService.addStudentServ(student);
            if (total != 0) return Result.success("添加成功！");
            else return Result.error("添加失败！");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }

    @GetMapping("/delete")
    public Result deleteStudent(Integer id){
        log.info("删除学生信息，参数：{}",id);
        try{
            Integer total = stuService.deleteStudentByIdServ(id);
            if (total != 0) return Result.success("删除成功！");
            else return Result.error("删除失败！");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }
    @PostMapping("/update")
    public Result updateStudentStu(@RequestBody Student student){
        log.info("更新学生信息，参数：id：{}",student);
        try{
            Integer total = stuService.updateStuServ(student);
            if (total != 0) return Result.success("修改成功！");
            else return Result.error("修改失败！");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }
    @PostMapping("/login")
    public Result login(String uName, String password){
        log.info("登录，参数：uName：{},password：{}",uName,password);
        try{
            Integer total = stuService.loginServ(uName, password);
            if (total!= 0) return Result.success("登录成功！");
            else return Result.error("登录失败！");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }

}
