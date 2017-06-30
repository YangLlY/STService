package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Materialdir;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by yly on 2017/6/26.
 */
public interface IMaterialdirService {
    int delById(Integer materialdirid);

    int add(Materialdir record);

    Materialdir findOneById(Integer materialdirid);

    int updateById(Materialdir record);

    int count(@Param("materialname")String materialname,@Param("materialdirid")Integer materialdirid);

    Materialdir findOneBydirIdAndName(@Param("materialname")String materialname,@Param("materialdirid")Integer materialdirid);

}
