package com.itheima;

import com.itheima.pojo.Orders;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class findOrdersTest {
    @Test
    public void findOrdersTest(){
        SqlSession session= MybatisUtils.getSession();
        Orders orders=session.selectOne("com.itheima.mapper."+"OrdersMapper.findOrdersWithPorduct",1);
        System.out.println(orders);
        session.close();
    }
}
