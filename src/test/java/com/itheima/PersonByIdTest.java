package com.itheima;

import com.itheima.pojo.Person;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PersonByIdTest {
    @Test
    public void findPersonByIdTest(){
        SqlSession session= MybatisUtils.getSession();
        Person person=session.selectOne("com.itheima.mapper.PersonMapper.findPersonById",1);
        System.out.println(person);
        session.close();
    }
}
