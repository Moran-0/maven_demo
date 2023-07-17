package com.moran.service.Locker;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.moran.mapper.Locker.LockerMapper;
import com.moran.Pojo.Locker;
import com.moran.Pojo.LockerPage;
import com.moran.Pojo.LockerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LockerServiceImpl implements LockerService{
    @Autowired
    private LockerMapper lockerMapper;
    @Override
    public LockerPage pageSelect(Integer page, Integer pageSize, String type, Double capacity) {
        PageHelper.startPage(page,pageSize);
        List<Locker> lockerList = lockerMapper.pageSelect(type,capacity);
        Page<Locker> p = (Page<Locker>) lockerList;
        LockerPage lockerPages = new LockerPage(p.getTotal(),p.getResult());
        return lockerPages;

    }

    @Override
    public List<LockerType> getLockerType(Integer shopId) {
        return lockerMapper.selectLockerType(shopId);
    }
}
