package com.moran;

import com.moran.mapper.TransferMapper;
import com.moran.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try{
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            TransferService transferService = applicationContext.getBean(TransferService.class);
            Integer id1 = 1;Integer id2 = 2;
            Integer total = transferService.transfer(id1, id2, 966.66);
            System.out.println(total);
            System.out.println("Success!!");
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
