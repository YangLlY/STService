package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.ServiceteamMapper;
import cn.edu.zjnu.STService.Dao.UserServicetMapper;
import cn.edu.zjnu.STService.Model.Serviceteam;
import cn.edu.zjnu.STService.Model.UserServicet;
import cn.edu.zjnu.STService.Service.IUserServicetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yly on 2017/5/13.
 */
@Service
public class UserServicetService implements IUserServicetService {
    @Resource
    private UserServicetMapper userServicetMapper;
    @Resource
    private ServiceteamMapper serviceteamMapper;

    public UserServicet findOneByName(String name) {
        return userServicetMapper.findOneByName(name);
    }

    public int delById(Integer id) {
        return userServicetMapper.delById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int addServicetAdmin(UserServicet userServicet, Serviceteam serviceteam) {
        //数据库添加服务团队
        serviceteamMapper.add(serviceteam);
        //添加服务团队成功后，再添加服务团队管理用户
        //添加userServicet对象中的服务团队Id、角色Id、创建时间、未删除标识
        userServicet.setSvtid(serviceteamMapper.findOneByName(serviceteam.getName()).getId());
        userServicet.setRoleid(20);
        userServicet.setCreattime(new Date());
        userServicet.setIsdelet(0);
        //数据库添加用户
        return userServicetMapper.add(userServicet);
    }

    public int add(UserServicet record) {
        return userServicetMapper.add(record);
    }

    public int updateById(UserServicet record) {
        return userServicetMapper.updateById(record);
    }
}
