package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Serviceteam;

public interface ServiceteamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Serviceteam record);

    int insertSelective(Serviceteam record);

    Serviceteam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Serviceteam record);

    int updateByPrimaryKey(Serviceteam record);
}