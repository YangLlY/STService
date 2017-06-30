package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.ServiceteamMapper;
import cn.edu.zjnu.STService.Model.Serviceteam;
import cn.edu.zjnu.STService.Service.IServiceteamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/5/15.
 */
@Service
public class ServiceteamService implements IServiceteamService {
    @Resource
    private ServiceteamMapper serviceteamMapper;

    public Serviceteam findOneByName(String name) {
        return serviceteamMapper.findOneByName(name);
    }

    public int delById(Integer id) {
        return serviceteamMapper.delById(id);
    }

    public int updateById(Serviceteam record) {
        return serviceteamMapper.updateById(record);
    }
}
