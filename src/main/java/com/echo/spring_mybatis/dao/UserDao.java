package com.echo.spring_mybatis.dao;

import com.echo.spring_mybatis.pojo.User;
import com.echo.spring_mybatis.pojo.query.UserQuery;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    //查询所有数据
    List<User> listUser();

    //根据id查询用户 后面编辑用户需要
    User queryUserById(Integer id);

    //根据用户名来查询并且分页展示  模糊匹配,不能用在修改数据是匹配是否也存在数据
    List<User> listUserByName(UserQuery userQuery);

    List<User> selectUserByName(UserQuery userQuery);
    //根据id删除
    int deleteUserById(Integer id);

    //修改
    int updateUser(User user);

    //新增用户
    public int addUser(User user);


}
