package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Serviceteam;
import org.springframework.stereotype.Service;

/**
 * Created by yly on 2017/5/15.
 */
public interface IServiceteamService {
    Serviceteam findOneByName(String name);

    int delById(Integer id);

    int updateById(Serviceteam record);
}
