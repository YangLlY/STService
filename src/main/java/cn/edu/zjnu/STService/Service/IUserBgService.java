package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.UserBg;

/**
 * Created by yly on 2017/5/12.
 */
public interface IUserBgService {
    UserBg findOneByName(String name);

    int add(UserBg record);

    int delById(Integer id);

    int updateById(UserBg record);
}
