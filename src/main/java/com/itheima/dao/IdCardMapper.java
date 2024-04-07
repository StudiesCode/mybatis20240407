package com.itheima.dao;
import com.itheima.pojo.IDCard;
import org.apache.ibatis.annotations.Select;

public interface IdCardMapper {
    @Select("select * from tb_idcard where id=#{id}")
    IDCard selectIdCardById(int id);
}
