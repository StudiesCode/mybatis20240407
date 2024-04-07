package com.itheima;

import com.itheima.dao.ClassMapper;
import com.itheima.dao.StudentMapper;
import com.itheima.dao.UsersMapper;
import com.itheima.pojo.IClass;
import com.itheima.pojo.IStudent;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class selectStudnetTest {
    @Test
    public void selectStudentById(){
        SqlSession session= MybatisUtils.getSession();
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        IStudent iStudent1=mapper.selectStudnet(2);
        System.out.println(iStudent1);
        session.close();

    }
    @Test
    public void updateStudentById(){
        SqlSession session= MybatisUtils.getSession();
        IStudent iStudent2=new IStudent();
        iStudent2.setId(4);
        iStudent2.setName("李雷");
        iStudent2.setAge(21);
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        mapper.updateStudent(iStudent2);
        session.commit();
        session.close();

    }

    @Test
    public void selectStudentWithByidTest(){
        SqlSession session= MybatisUtils.getSession();
        ClassMapper mapper=session.getMapper(ClassMapper.class);
        IClass iClass=mapper.selectClassById(2);
        System.out.println(iClass);
        session.close();
    }
}
