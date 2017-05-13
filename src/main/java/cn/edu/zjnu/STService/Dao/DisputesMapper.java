package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Disputes;

public interface DisputesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disputes record);

    int insertSelective(Disputes record);

    Disputes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Disputes record);

    int updateByPrimaryKey(Disputes record);
}