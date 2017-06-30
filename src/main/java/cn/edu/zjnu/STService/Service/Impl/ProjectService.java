package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.ProjectMapper;
import cn.edu.zjnu.STService.Model.Project;
import cn.edu.zjnu.STService.Service.IProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/6/27.
 */
@Service
public class ProjectService implements IProjectService{
    @Resource
    private ProjectMapper projectMapper;

    public Project findOneById(Integer proid) {
        return projectMapper.findOneById(proid);
    }

    public int delById(Integer proid) {
        return projectMapper.delById(proid);
    }

    public int add(Project record) {
        return projectMapper.add(record);
    }

    public int updateById(Project record) {
        return projectMapper.updateById(record);
    }
}
