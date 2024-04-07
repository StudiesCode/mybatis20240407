package com.itheima.dao;

import com.itheima.pojo.IClass;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ClassMapper {
    @Select("select * from c_class where id=#{id}")
    @Results({@Result(id = true,column = "id",property = "id"),
            @Result(column = "classname",property = "classname"),
            @Result(column = "id",property = "iStudentList",
                many = @Many(select = "com.itheima.dao.StudentMapper.selectStudentWithClassId")
            )
    })
    IClass selectClassById(int cid);
}
