package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.UserServicet;

public interface UserServicetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserServicet record);

    int insertSelective(UserServicet record);

    UserServicet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserServicet record);

    int updateByPrimaryKey(UserServicet record);
}