package com.moran.service.User;

import com.moran.Pojo.Manager;
import java.util.List;
public interface ManagerService {
    List<Manager> selectManagersBy(String userId, String shopId);

    void addManager(Manager manager);

    void changeStatus(String userId,boolean status);

    Integer getCount(String userId);

    List<Manager> login(Manager manager);
}
