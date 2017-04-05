package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.TestUserMapper;
import cn.edu.zjnu.STService.Model.TestUser;
import cn.edu.zjnu.STService.Service.ITestUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/3/31.
 */
@Service
public class TestUserService implements ITestUserService {
    @Resource
    private TestUserMapper testUserMapper;

    public void deleteByPrimaryKey(Integer id) {
        testUserMapper.deleteByPrimaryKey(id);
    }

    public void insert(TestUser record) {
        testUserMapper.insert(record);
    }

    public void insertSelective(TestUser record) {
        testUserMapper.insertSelective(record);
    }

    public TestUser selectByPrimaryKey(Integer id) {
        return testUserMapper.selectByPrimaryKey(id);
    }

    public TestUser selectByUserName(String userName) {
        return testUserMapper.selectByUserName(userName);
    }

    public void updateByPrimaryKeySelective(TestUser record) {
        testUserMapper.updateByPrimaryKeySelective(record);
    }

    public void updateByPrimaryKey(TestUser record) {
        testUserMapper.updateByPrimaryKey(record);
    }
}
