package com.xbz.aopdemo.service.impl;

import com.xbz.aopdemo.dao.MyBatisUserDao;
import com.xbz.aopdemo.pojo.User;
import com.xbz.aopdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private MyBatisUserDao userDao;

    @Override
    public User getUser(Integer id){
        return userDao.getUser(id);
    }

}
