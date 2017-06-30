package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Model.UserFirm;
import org.springframework.stereotype.Service;

/**
 * Created by yly on 2017/5/13.
 */
public interface IUserFirmService {
    /**
     * 通过用户名，查找用户对象信息
     * @param userName
     * @return
     */
    UserFirm findOneByUserName(String userName);

    /**
     * 添加Firm对象成功后，才能添加企业管理用户对象
     * （若添加企业管理用户对象时出错，则先前添加的Firm信息将回滚）
     *
     * @param userFirm
     * @param firm
     * @return
     */
    int addFirmAdmin(UserFirm userFirm, Firm firm);

    /**
     * 添加企业普通用户对象
     * @param record
     * @return
     */
    int add(UserFirm record);

    int delById(Integer id);

    int updateById(UserFirm record);
}
