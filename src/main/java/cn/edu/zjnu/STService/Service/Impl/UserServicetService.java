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

    public int deleteByUserId(Integer id) {
        return userServicetMapper.deleteByPrimaryKey(id);
    }

    public int insert(UserServicet record) {
        return userServicetMapper.insert(record);
    }

    public int insertSelective(UserServicet record) {
        return userServicetMapper.insertSelective(record);
    }

    public UserServicet selectByUserId(Integer id) {
        return userServicetMapper.selectByPrimaryKey(id);
    }

    public int updateByUserIdSelective(UserServicet record) {
        return userServicetMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByUserId(UserServicet record) {
        return userServicetMapper.updateByPrimaryKey(record);
    }
}
