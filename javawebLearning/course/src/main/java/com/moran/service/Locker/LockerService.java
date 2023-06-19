package com.moran.service.Locker;

import com.moran.pojo.LockerPage;

public interface LockerService {

    LockerPage pageSelect(Integer page, Integer pageSize, String type, Double capacity);
}
