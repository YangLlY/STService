package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.FirmMapper;
import cn.edu.zjnu.STService.Dao.UserFirmMapper;
import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Model.UserFirm;
import cn.edu.zjnu.STService.Service.IUserFirmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yly on 2017/5/13.
 */
@Service
public class UserFirmService implements IUserFirmService{
    @Resource
    private UserFirmMapper userFirmMapper;
    @Resource
    private FirmMapper firmMapper;

    public UserFirm findOneByUserName(String userName) {
        return userFirmMapper.findOneByUserName(userName);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int addFirmAdmin(UserFirm userFirm, Firm firm) {
        //添加firm对象中的加入时间
        firm.setJointime(new Date());
        //数据库添加公司
        firmMapper.add(firm);
        //System.out.println(1/0);测试事务管理回滚
        //添加公司成功后，再添加企业管理用户
        //添加userFirm对象中的企业Id、角色Id、创建时间、未删除标识
        userFirm.setFirmid(firmMapper.findOneByName(firm.getName()).getId());
        userFirm.setRoleid(10);
        userFirm.setCreattime(new Date());
        userFirm.setIsdelet(0);
        //数据库添加用户
        return userFirmMapper.add(userFirm);
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
