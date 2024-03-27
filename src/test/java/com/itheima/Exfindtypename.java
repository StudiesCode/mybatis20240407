package com.itheima;

import com.itheima.pojo.Category;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Exfindtypename {
    @Test
    public void Exfindtypename(){
        SqlSession session= MybatisUtils.getSession();
        Category category=session.selectOne("com.itheima.mapper.CategoryMapper.ProductWithCategory",2);
        System.out.println(category);
        session.close();
    }
}
