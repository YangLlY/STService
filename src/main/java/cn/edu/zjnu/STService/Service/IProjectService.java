package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Project;
import org.springframework.stereotype.Service;

/**
 * Created by yly on 2017/6/27.
 */
public interface IProjectService {
    Project findOneById(Integer proid);

    int delById(Integer proid);

    int add(Project record);

    int updateById(Project record);
}
