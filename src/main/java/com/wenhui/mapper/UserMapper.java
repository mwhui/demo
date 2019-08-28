package com.wenhui.mapper;

import com.wenhui.entities.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select password from user where username=#{username}")
    String getPassword(String username);

}