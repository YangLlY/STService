package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Serviceteam;

public interface ServiceteamMapper {
    Serviceteam findOneByName(String name);

    int add(Serviceteam record);

    int delById(Integer id);

    int updateById(Serviceteam record);
}