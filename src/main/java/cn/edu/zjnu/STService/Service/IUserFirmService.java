package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.UserFirm;

/**
 * Created by yly on 2017/5/13.
 */
public interface IUserFirmService {
    UserFirm findOneByUserName(String userName);

    int add(UserFirm record);

    int delById(Integer id);

    int updateById(UserFirm record);
}
