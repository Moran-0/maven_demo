package com.moran.service.Locker;

import com.moran.Pojo.LockerPage;
import com.moran.Pojo.LockerType;

import java.util.List;

public interface LockerService {

    LockerPage pageSelect(Integer page, Integer pageSize, String type, Double capacity);

    List<LockerType> getLockerType(Integer shopId);
}
