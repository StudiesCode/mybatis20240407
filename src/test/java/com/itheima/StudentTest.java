package com.itheima;

import com.itheima.pojo.Student;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    public void findStudent(){
        SqlSession session=MybatisUtils.getSession();
        Student student=session.selectOne("com.itheima.mapper."+"StudentMapper.findstudnet",1);
        System.out.println(student.toString());
        Student student2=session.selectOne("com.itheima.mapper."+"StudentMapper.findstudnet",1);
        System.out.println(student2.toString());
        session.close();
    }

//    @Test
//    public void findStudentByNameAndMajorTest(){
//        SqlSession session= MybatisUtils.getSession();
//        Student student = new Student();
//        student.setName("张三");
//        student.setMajor("语文");
//        List<Student> students=session.selectList("com.itheima.mapper.StudentMapper.findStudentByNameAndMajor", student);
//        for (Student s:students){
//            System.out.println(s);
//        }
//        session.close();
//    }
//    @Test
//    public void findByIdLsit5Test(){
//        SqlSession session= MybatisUtils.getSession();
//        List<Integer> ids=new ArrayList<Integer>();
//        for(int i=1;i<5;i++)
//        {
//            ids.add(i);
//        }
//        List<Student> students=session.selectList("com.itheima.mapper.StudentMapper.findByIdLsit5", ids);
//        for (Student s:students){
//            System.out.println(s);
//        }
//        session.close();
//    }
}
