package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.UserBg;

public interface UserBgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBg record);

    int insertSelective(UserBg record);

    UserBg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBg record);

    int updateByPrimaryKey(UserBg record);
}