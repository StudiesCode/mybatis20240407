package com.itheima.dao;

import com.itheima.pojo.IStudent;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentMapper {
    @Select("select * from c_student where cid=#{cid}")
    IStudent selectStudnet(int id);

    @Update("update c_student set name=#{name},age=#{age} where id=#{id}")
    int updateStudent(IStudent iStudent);

    @Select("select * from c_student where cid=#{cid}")
    @Results({@Result(id = true,property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age"),
    })
    List<IStudent> selectStudentWithClassId(int cid);
}
