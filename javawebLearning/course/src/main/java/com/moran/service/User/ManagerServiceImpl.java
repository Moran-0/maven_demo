package com.moran.service.User;

import com.moran.mapper.User.ManagerMapper;
import com.moran.pojo.Manager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public List<Manager> selectManagersBy(String userId, String shopId) {
        List<Manager> managers = managerMapper.selectManagersBy(userId, shopId);
        return managers;
    }

    @Override
    public void addManager(Manager manager) {
        manager.setStatus(true);
        manager.setCreateId("admin");
        manager.setCreateTime(LocalDateTime.now());
        managerMapper.insertManager(manager);
    }

    @Override
    public void changeStatus(String userId,boolean status) {
        managerMapper.updateStatus(userId,status);
    }

    @Override
    public Integer getCount(String userId) {
        return managerMapper.getCount(userId);
    }

    @Override
    public List<Manager> login(Manager manager) {
        List<Manager> user = managerMapper.getUser(manager);
        return user;
    }
}
