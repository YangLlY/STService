package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.UserFirm;

public interface UserFirmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFirm record);

    int insertSelective(UserFirm record);

    UserFirm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFirm record);

    int updateByPrimaryKey(UserFirm record);
}