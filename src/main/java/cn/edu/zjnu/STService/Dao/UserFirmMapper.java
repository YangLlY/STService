package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.UserFirm;

public interface UserFirmMapper {
    UserFirm findOneByUserName(String userName);

    int add(UserFirm record);

    int delById(Integer id);

    int updateById(UserFirm record);
}