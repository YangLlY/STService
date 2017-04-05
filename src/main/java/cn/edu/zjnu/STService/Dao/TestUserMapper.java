package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.TestUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TestUserMapper {
    void deleteByPrimaryKey(Integer id);

    void insert(TestUser record);

    void insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    TestUser selectByUserName(String userName);

    void updateByPrimaryKeySelective(TestUser record);

    void updateByPrimaryKey(TestUser record);
}