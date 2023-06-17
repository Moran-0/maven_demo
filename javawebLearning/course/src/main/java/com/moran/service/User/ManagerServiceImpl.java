package com.moran.service.User;

import com.moran.mapper.User.ManagerMapper;
import com.moran.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
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
}
