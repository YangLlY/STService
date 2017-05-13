package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.UserFirmMapper;
import cn.edu.zjnu.STService.Model.UserFirm;
import cn.edu.zjnu.STService.Service.IUserFirmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/5/13.
 */
@Service
public class UserFirmService implements IUserFirmService{
    @Resource
    private UserFirmMapper userFirmMapper;

    public int deleteByUserId(Integer id) {
        return userFirmMapper.deleteByPrimaryKey(id);
    }

    public int insert(UserFirm record) {
        return userFirmMapper.insert(record);
    }

    public int insertSelective(UserFirm record) {
        return userFirmMapper.insertSelective(record);
    }

    public UserFirm selectByUseId(Integer id) {
        return userFirmMapper.selectByPrimaryKey(id);
    }

    public int updateByUserIdSelective(UserFirm record) {
        return userFirmMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByUserId(UserFirm record) {
        return userFirmMapper.updateByPrimaryKey(record);
    }
}
