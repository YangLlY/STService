package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.UserFirm;

/**
 * Created by yly on 2017/5/13.
 */
public interface IUserFirmService {
    int deleteByUserId(Integer id);

    int insert(UserFirm record);

    int insertSelective(UserFirm record);

    UserFirm selectByUseId(Integer id);

    int updateByUserIdSelective(UserFirm record);

    int updateByUserId(UserFirm record);
}
