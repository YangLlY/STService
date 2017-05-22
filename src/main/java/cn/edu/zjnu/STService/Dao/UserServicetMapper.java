package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.UserServicet;

public interface UserServicetMapper {
    UserServicet findOneByName(String name);

    int delById(Integer id);

    int add(UserServicet record);

    int updateById(UserServicet record);
}