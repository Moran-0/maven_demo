package com.moran;

import com.moran.mapper.UserMapper;
import com.moran.pojo.User;
import com.moran.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.info("查询用户表测试");
        log.info("Lombok test!");
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        List<User> users = userMapper.selectUsers();
//        System.out.println(users);
//        System.out.println("Hello world!");
//        User user = userMapper.selectUser(1);
//        System.out.println(user);
//        User user2 = new User(null,"JJJJerry","6666666","世华");
//        userMapper.addUser(user2);
//        System.out.println(user2.getId());
//        User user3 = new User(4,"JJJJerry","1234567890","ahaha");
//        userMapper.updateUser(user3);
//        userMapper.deleteUser(4);
//        List<Integer> ids = new ArrayList<Integer>();
//        ids.add(7);ids.add(8);
        int[] ids = {1, 2, 3};
        System.out.println(ids);
//        userMapper.deleteUsers(ids);
//        userMapper.selectUsersFor(ids);
//        sqlSession.commit();//提交事务
        selectUserMap();
    }
    private static void selectUserMap(){
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = {1,2,3};
        String userName = "J";
        Map map = new HashMap<>();
        map.put("ids",ids);
        map.put("userName",userName);
        List<User> users = userMapper.selectUsersMap(map);
        System.out.println(users);
    }
}
