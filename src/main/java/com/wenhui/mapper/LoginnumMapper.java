package com.wenhui.mapper;

import com.wenhui.entities.Loginnum;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LoginnumMapper {

    @Select("select * from loginnum")
//    column为数据库字段名，porperty为实体类属性名，jdbcType为数据库字段数据类型，id为是否为主键。
    @Results({
            @Result(property = "id", column = "id",jdbcType= JdbcType.INTEGER, id=true),
            @Result(property = "num", column = "num",jdbcType=JdbcType.INTEGER)
            })
    List<Loginnum> getAll();

        @Select("select num from loginnum where id=#{id}")
        int getNum(int id);

        @Update({"update loginnum set num=#{num} where id=#{id}"})
        void Update(Loginnum loginnum);


}
