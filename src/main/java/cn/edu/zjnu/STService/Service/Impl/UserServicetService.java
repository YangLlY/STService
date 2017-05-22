package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.UserServicetMapper;
import cn.edu.zjnu.STService.Model.UserServicet;
import cn.edu.zjnu.STService.Service.IUserServicetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/5/13.
 */
@Service
public class UserServicetService implements IUserServicetService {
    @Resource
    private UserServicetMapper userServicetMapper;

    public UserServicet findOneByName(String name) {
        return userServicetMapper.findOneByName(name);
    }

    public int delById(Integer id) {
        return userServicetMapper.delById(id);
    }

    public int add(UserServicet record) {
        return userServicetMapper.add(record);
    }

    public int updateById(UserServicet record) {
        return userServicetMapper.updateById(record);
    }
}
