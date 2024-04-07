package com.itheima;

import com.itheima.dao.OrdersMapper;
import com.itheima.pojo.Orders;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class selectOrdersByIdTest {
    @Test
    public void selectOrdersByIdtest(){
        SqlSession session= MybatisUtils.getSession();
        OrdersMapper mapper=session.getMapper(OrdersMapper.class);
        Orders orders=mapper.selectOrdersById(2);
        System.out.println(orders);
        session.close();
    }
}
