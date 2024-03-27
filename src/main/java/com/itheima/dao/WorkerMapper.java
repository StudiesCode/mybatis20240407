package com.itheima.dao;
import com.itheima.pojo.Worker;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WorkerMapper {
    @Select("select * from tb_worker where id=#{id}")
    Worker selectWorker(int id);

    @Insert("insert into tb_worker(id,name,age,sex,worker_id)"+"values(#{id},#{name},#{age},#{sex},#{worker_id})")
    int insertWorker(Worker worker);

    @Update("Update tb_worker set name=#{name},age=#{age} "+"where id = #{id}")
    int updateWorker(Worker worker);

    @Delete("delete from tb_worker where id=#{id}")
    int deleteWorker(int id);
}
