package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.UserBg;

public interface UserBgMapper {
    UserBg findOneByName(String name);

    int add(UserBg record);

    int delById(Integer id);

    int updateById(UserBg record);
}