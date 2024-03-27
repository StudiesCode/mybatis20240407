package com.itheima;

import com.itheima.dao.WorkerMapper;
import com.itheima.pojo.Worker;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class findWorkerByIdTest {
    @Test
    public void findWorkerByIdTest(){
        SqlSession session= MybatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        Worker worker=mapper.selectWorker(1);
        System.out.println(worker);
        session.close();

    }
    @Test
    public void insertWorkerByTest(){
        SqlSession session= MybatisUtils.getSession();
        Worker worker=new Worker();
        worker.setId(1);
        worker.setName("李四");
        worker.setAge(19);
        worker.setSex("女");
        worker.setWorker_id("1002");
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        int result=mapper.insertWorker(worker);
        System.out.println(worker);
        session.commit();
        session.close();
    }

    @Test
    public void udateWorlerTest(){
        SqlSession session= MybatisUtils.getSession();
        Worker worker=new Worker();
        worker.setId(1);
        worker.setName("李华");
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        int result=mapper.updateWorker(worker);
        session.commit();
        session.close();

    }

    @Test
    public void deteleWorkerTest(){
        SqlSession session= MybatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        int result=mapper.deleteWorker(1);
    }

}
