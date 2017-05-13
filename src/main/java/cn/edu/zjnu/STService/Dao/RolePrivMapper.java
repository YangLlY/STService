package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.RolePriv;

public interface RolePrivMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePriv record);

    int insertSelective(RolePriv record);

    RolePriv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePriv record);

    int updateByPrimaryKey(RolePriv record);
}