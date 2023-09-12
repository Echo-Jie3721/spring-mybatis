package com.echo.spring_mybatis.service;

import com.echo.spring_mybatis.dao.UserDao;
import com.echo.spring_mybatis.pojo.User;
import com.echo.spring_mybatis.pojo.query.UserQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Override
    public PageInfo<User> listUserByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<User>(userDao.listUserByName(userQuery));
    }

    @Override
    public PageInfo<User> selectUserByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<User>(userDao.listUserByName(userQuery));
    }

    @Override
    public boolean deleteUserById(Integer id) {
        int b = userDao.deleteUserById(id);
        if (b > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        int i = userDao.updateUser(user);
        if(i>0){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user) > 0 ? true : false;
    }

}
