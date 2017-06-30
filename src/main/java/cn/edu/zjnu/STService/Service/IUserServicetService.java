package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Serviceteam;
import cn.edu.zjnu.STService.Model.UserServicet;
import org.springframework.stereotype.Service;

/**
 * Created by yly on 2017/5/13.
 */
public interface IUserServicetService {
    /**
     * 通过用户名，查找用户对象信息
     * @param name
     * @return
     */
    UserServicet findOneByName(String name);

    int delById(Integer id);

    /**
     * 添加ServiceTeam对象成功后，才能添加服务团队管理用户userServicet对象
     * （若添加服务团队管理用户对象时出错，则先前添加的ServiceTeam信息将回滚）
     * @param userServicet
     * @param serviceteam
     * @return
     */
    int addServicetAdmin(UserServicet userServicet, Serviceteam serviceteam);
    /**
     * 添加服务团队普通用户
     * @param record
     * @return
     */
    int add(UserServicet record);

    int updateById(UserServicet record);
}
