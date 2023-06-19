package com.moran.mapper.Locker;

import com.moran.pojo.Locker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LockerMapper {

    List<Locker> pageSelect(String type, Double capacity);
}
