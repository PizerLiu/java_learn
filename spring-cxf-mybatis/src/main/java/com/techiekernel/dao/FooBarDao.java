package com.techiekernel.dao;

import org.apache.ibatis.annotations.Select;

public interface FooBarDao {
    @Select("select count(*) from ask900_user")
    Long getAccount();
}
