package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Serviceteam;

/**
 * Created by yly on 2017/5/15.
 */
public interface IServiceteamService {
    Serviceteam findOneByName(String name);

    int add(Serviceteam record);

    int delById(Integer id);

    int updateById(Serviceteam record);
}
