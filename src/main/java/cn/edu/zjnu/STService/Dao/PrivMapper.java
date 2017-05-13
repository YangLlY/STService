package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Priv;

public interface PrivMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Priv record);

    int insertSelective(Priv record);

    Priv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Priv record);

    int updateByPrimaryKey(Priv record);
}