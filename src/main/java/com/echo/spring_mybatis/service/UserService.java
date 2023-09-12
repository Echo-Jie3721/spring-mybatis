package com.echo.spring_mybatis.service;

import com.echo.spring_mybatis.pojo.User;
import com.echo.spring_mybatis.pojo.query.UserQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    //查询所有数据
    public List<User> listUser();

    //根据用户名来查询并且分页展示  模糊匹配
    public PageInfo<User> listUserByName(UserQuery userQuery);

    //根据用户名来查询并且分页展示  非模糊匹配
    public PageInfo<User> selectUserByName(UserQuery userQuery);

    //根据id删除
    public boolean deleteUserById(Integer id);

    //根据id查询
    public User queryUserById(Integer id);

    //修改用户
    public boolean updateUser(User user);

    //新增用户
    public boolean addUser(User user);
}
