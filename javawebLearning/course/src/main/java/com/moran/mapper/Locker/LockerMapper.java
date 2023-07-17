package com.moran.mapper.Locker;

import com.moran.Pojo.Locker;
import com.moran.Pojo.LockerType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LockerMapper {

    List<Locker> pageSelect(String type, Double capacity);

    List<LockerType> selectLockerType(Integer shopId);
}
