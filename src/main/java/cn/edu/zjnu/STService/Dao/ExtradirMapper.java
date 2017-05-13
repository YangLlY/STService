package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Extradir;

public interface ExtradirMapper {
    int deleteByPrimaryKey(Integer extradirid);

    int insert(Extradir record);

    int insertSelective(Extradir record);

    Extradir selectByPrimaryKey(Integer extradirid);

    int updateByPrimaryKeySelective(Extradir record);

    int updateByPrimaryKey(Extradir record);
}