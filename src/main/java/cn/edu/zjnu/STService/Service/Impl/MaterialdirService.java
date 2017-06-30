package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.MaterialdirMapper;
import cn.edu.zjnu.STService.Model.Materialdir;
import cn.edu.zjnu.STService.Service.IMaterialdirService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/6/26.
 */
@Service
public class MaterialdirService implements IMaterialdirService {
    @Resource
    private MaterialdirMapper materialdirMapper;

    public int delById(Integer materialdirid) {
        return materialdirMapper.delById(materialdirid);
    }

    public int add(Materialdir record) {

        return materialdirMapper.add(record);
    }

    public Materialdir findOneById(Integer materialdirid) {
        return materialdirMapper.findOneById(materialdirid);
    }

    public int updateById(Materialdir record) {
        return materialdirMapper.updateById(record);
    }

    public int count(String materialname, Integer materialdirid) {
        return materialdirMapper.count(materialname,materialdirid);
    }

    public Materialdir findOneBydirIdAndName(String materialname, Integer materialdirid) {
        return materialdirMapper.findOneBydirIdAndName(materialname,materialdirid);
    }

}
