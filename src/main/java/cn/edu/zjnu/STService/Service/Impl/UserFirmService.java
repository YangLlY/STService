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

    public UserFirm findOneByUserName(String userName) {
        return userFirmMapper.findOneByUserName(userName);
    }

    public int add(UserFirm record) {
        return userFirmMapper.add(record);
    }

    public int delById(Integer id) {
        return userFirmMapper.delById(id);
    }

    public int updateById(UserFirm record) {
        return userFirmMapper.updateById(record);
    }
}
