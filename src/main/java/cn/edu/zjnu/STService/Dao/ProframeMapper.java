package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Proframe;

public interface ProframeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Proframe record);

    int insertSelective(Proframe record);

    Proframe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Proframe record);

    int updateByPrimaryKey(Proframe record);
}