package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.UserServicet;

/**
 * Created by yly on 2017/5/13.
 */
public interface IUserServicetService {
    int deleteByUserId(Integer id);

    int insert(UserServicet record);

    int insertSelective(UserServicet record);

    UserServicet selectByUserId(Integer id);

    int updateByUserIdSelective(UserServicet record);

    int updateByUserId(UserServicet record);
}
