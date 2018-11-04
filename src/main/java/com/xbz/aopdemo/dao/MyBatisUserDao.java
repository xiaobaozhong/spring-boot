package com.xbz.aopdemo.dao;

import com.xbz.aopdemo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBatisUserDao {
    public User getUser(Integer id);
}
