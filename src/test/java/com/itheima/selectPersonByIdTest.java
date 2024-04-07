package com.itheima;

import com.itheima.dao.PersonMapper;
import com.itheima.pojo.Person;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class selectPersonByIdTest {
    @Test
    public void selectPersonByIdTest(){
    SqlSession session= MybatisUtils.getSession();
    PersonMapper mapper=session.getMapper(PersonMapper.class);
    Person person=mapper.selectPersonById(1);
    System.out.println(person);
    session.close();
    }
}
