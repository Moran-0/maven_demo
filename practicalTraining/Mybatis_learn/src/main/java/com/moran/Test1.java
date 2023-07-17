package com.moran;


import com.moran.mapper.GoodsMapper;
import com.moran.mapper.GoodsTypeMapper;
import com.moran.Pojo.Goods;
import com.moran.Pojo.GoodsType1;
import com.moran.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

@Slf4j
public class Test1 {
    private static SqlSession sqlSession;
    private static GoodsMapper goodsMapper;
    private static GoodsTypeMapper goodsTypeMapper;
    static {
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        goodsMapper = sqlSession.getMapper(GoodsMapper.class);
        goodsTypeMapper = sqlSession.getMapper(GoodsTypeMapper.class);
    }

    public static void main(String[] args) {
        selectGoods();
//        selectGoodsType();
    }

    private static void selectGoods(){
        log.info("多对一关联查询goods");
        List<Goods> goodsList = goodsMapper.selectGoods();
        for (Goods good : goodsList){
            System.out.println(good);
        }
    }

    private static void selectGoodsType(){
        log.info("一对多查询goodsType");
        List<GoodsType1> goodsType1List = goodsTypeMapper.selectGoodsTypes();
        for (GoodsType1 good : goodsType1List){
            System.out.println(good);
        }
    }
}
