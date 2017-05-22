package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.UserServicet;

/**
 * Created by yly on 2017/5/13.
 */
public interface IUserServicetService {
    UserServicet findOneByName(String name);

    int delById(Integer id);

    int add(UserServicet record);

    int updateById(UserServicet record);
}
