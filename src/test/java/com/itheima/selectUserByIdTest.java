package com.itheima;

import com.itheima.dao.UsersMapper;
import com.itheima.pojo.Users;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class selectUserByIdTest {
    @Test
    public void selectUserByIdTest(){
        SqlSession session= MybatisUtils.getSession();
        UsersMapper mapper=session.getMapper(UsersMapper.class);
        Users users=mapper.selectUserById(1);
        System.out.println(users.toString());
        session.close();
    }

}
