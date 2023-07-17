package com.moran.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TransferMapper {
    Integer transfer(@Param("id") Integer id, @Param("money") Double money);

}
