package com.itheima;

import com.itheima.pojo.Book;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class findBookByIdTest {
    @Test
    public void findBookByIdTest(){
        SqlSession session= MybatisUtils.getSession();
        Book book1=session.selectOne("com.itheima.mapper."+"BookMapper.findBookById",1);
        System.out.println(book1);
        System.out.println("------------------------------------------------------------");
        Book book2=session.selectOne("com.itheima.mapper."+"BookMapper.findBookById",1);
        System.out.println(book2);
        session.close();
    }
    @Test
    public void updateTest2(){
        SqlSession session= MybatisUtils.getSession();
        Book book1=session.selectOne("com.itheima.mapper."+"BookMapper.findBookById",1);
        System.out.println(book1);
        System.out.println("------------------------------------------------------------");
        Book book2=new Book();
        book2.setId(1);
        book2.setBookName("Mysql数据库入门");
        book2.setPrice(40.2);
        session.update("com.itheima.mapper."+"BookMapper.updateBook",book2);
        session.commit();
        System.out.println("------------------------------------------------------------");
        Book book3=session.selectOne("com.itheima.mapper."+"BookMapper.findBookById",1);
        System.out.println(book2);
        session.close();
    }
    @Test
    public void findBookByIdTest3(){
        SqlSession session1= MybatisUtils.getSession();
        SqlSession session2= MybatisUtils.getSession();
        Book book1=session1.selectOne("com.itheima.mapper."+"BookMapper.findBookById",1);
        System.out.println(book1);
        session1.close();
        System.out.println("------------------------------------------------------------");
        Book book2=session2.selectOne("com.itheima.mapper."+"BookMapper.findBookById",1);
        System.out.println(book2);
        session2.close();
    }
}
