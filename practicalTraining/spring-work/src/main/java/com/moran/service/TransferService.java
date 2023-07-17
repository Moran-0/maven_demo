package com.moran.service;

import com.moran.mapper.TransferMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
    @Autowired
    private TransferMapper transferMapper;
    public Integer transfer(Integer id1,Integer id2,Double money){
        Integer t1 = transferMapper.transfer(id1,money);
        Integer t2 = transferMapper.transfer(id2,money);
        return t1+t2;
    }
}
