package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Contract;

public interface ContractMapper {
    int deleteByPrimaryKey(Integer contid);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer contid);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}