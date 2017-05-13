package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Materialdir;

public interface MaterialdirMapper {
    int deleteByPrimaryKey(Integer materialdirid);

    int insert(Materialdir record);

    int insertSelective(Materialdir record);

    Materialdir selectByPrimaryKey(Integer materialdirid);

    int updateByPrimaryKeySelective(Materialdir record);

    int updateByPrimaryKey(Materialdir record);
}