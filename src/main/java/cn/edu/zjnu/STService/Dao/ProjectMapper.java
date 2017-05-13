package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}