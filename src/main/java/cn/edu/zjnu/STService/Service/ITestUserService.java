package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.TestUser;

/**
 * Created by yly on 2017/3/31.
 */

public interface ITestUserService {
    void deleteByPrimaryKey(Integer id);

    void insert(TestUser record);

    void insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    TestUser selectByUserName(String userName);

    void updateByPrimaryKeySelective(TestUser record);

    void updateByPrimaryKey(TestUser record);
}
