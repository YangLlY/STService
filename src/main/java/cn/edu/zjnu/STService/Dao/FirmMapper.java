package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Firm;

public interface FirmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Firm record);

    int insertSelective(Firm record);

    Firm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);
}