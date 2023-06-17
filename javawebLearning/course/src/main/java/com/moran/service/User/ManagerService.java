package com.moran.service.User;

import com.moran.pojo.Manager;
import java.util.List;
public interface ManagerService {
    List<Manager> selectManagersBy(String userId, String shopId);

    void addManager(Manager manager);
}
