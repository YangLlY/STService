package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.UserBgMapper;
import cn.edu.zjnu.STService.Model.UserBg;
import cn.edu.zjnu.STService.Service.IUserBgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/5/12.
 */
@Service
public class UserBgService implements IUserBgService {
    @Resource
    private UserBgMapper userBgMapper;

    public UserBg findOneByName(String name) {
        return userBgMapper.findOneByName(name);
    }

    public int add(UserBg record) {
        return userBgMapper.add(record);
    }

    public int delById(Integer id) {
        return userBgMapper.delById(id);
    }

    public int updateById(UserBg record) {
        return userBgMapper.updateById(record);
    }
}
