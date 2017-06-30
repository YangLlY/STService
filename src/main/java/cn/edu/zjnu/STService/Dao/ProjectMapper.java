package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Project;

public interface ProjectMapper {
    Project findOneById(Integer proid);

    int delById(Integer proid);

    int add(Project record);

    int updateById(Project record);
}