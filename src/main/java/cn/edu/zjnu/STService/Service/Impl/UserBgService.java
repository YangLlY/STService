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

    public int deleteByUserId(Integer id) {
        return userBgMapper.deleteByPrimaryKey(id);
    }

    public int insert(UserBg record) {
        return userBgMapper.insert(record);
    }

    public int insertSelective(UserBg record) {
        return userBgMapper.insertSelective(record);
    }

    public UserBg selectByUserId(Integer id) {
        return userBgMapper.selectByPrimaryKey(id);
    }

    public int updateByUserIdSelective(UserBg record) {
        return userBgMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByUserId(UserBg record) {
        return userBgMapper.updateByPrimaryKey(record);
    }
}
