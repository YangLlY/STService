package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Materialdir;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface MaterialdirMapper {
    int delById(Integer materialdirid);

    int add(Materialdir record);

    Materialdir findOneById(Integer materialdirid);

    int updateById(Materialdir record);

    int count(@Param("materialname")String materialname,@Param("materialdirid")Integer materialdirid);

    Materialdir findOneBydirIdAndName(@Param("materialname")String materialname,@Param("materialdirid")Integer materialdirid);
}