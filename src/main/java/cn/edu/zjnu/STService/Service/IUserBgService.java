package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.UserBg;

/**
 * Created by yly on 2017/5/12.
 */
public interface IUserBgService {
    int deleteByUserId(Integer id);

    int insert(UserBg record);

    int insertSelective(UserBg record);

    UserBg selectByUserId(Integer id);

    int updateByUserIdSelective(UserBg record);

    int updateByUserId(UserBg record);
}
