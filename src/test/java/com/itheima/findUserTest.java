package com.itheima;

import com.itheima.pojo.Users;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class findUserTest {
    @Test
    public void findUserTest(){
        SqlSession session= MybatisUtils.getSession();
        Users users=session.selectOne("com.itheima.mapper."+"UserMapper.findUserWithOrders",1);
        System.out.println(users);
        session.close();
    }
}
