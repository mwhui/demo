package com.wenhui.mapper;

import com.github.pagehelper.Page;
import com.wenhui.entities.Employee;
import org.apache.ibatis.annotations.*;


import java.util.List;

public interface EmployeeMapper {
    @Select("select * from employee")
    //    column为数据库字段名，porperty为实体类属性名，jdbcType为数据库字段数据类型，id为是否为主键。
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "email", column = "email"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "department", column = "department"),
            @Result(property = "birth", column = "birth")
    })
    List<Employee> getAll();

    @Select("select DISTINCT department from employee")
    @Results({
            @Result(property = "department", column = "department"),

    })
    List<Employee> getDepartment();

    @Select("select * from employee where id=#{id}")
    Employee getByid(int id);

    @Insert({"insert into employee(name,email,gender,department,birth) values(#{name},#{email},#{gender},#{department},#{birth})"})
    void install(Employee employee);

    @Update({"update employee set name=#{name},email=#{email},gender=#{gender},department=#{department},birth=#{birth} where id=#{id}"})
    void Update(Employee employee);

    @Delete("delete from employee where id=#{id}")
    void delete(int id);

    @Select("select * from employee")
    List<Employee> Allemployee();

}
