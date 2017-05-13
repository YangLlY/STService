package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.FirmMapper;
import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Service.IFirmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yly on 2017/5/13.
 */
@Service
public class FirmService implements IFirmService {
    @Resource
    private FirmMapper firmMapper;

    public Firm findOneByName(String name) {
        return firmMapper.findOneByName(name);
    }

    public int add(Firm record) {
        return firmMapper.add(record);
    }

    public int delById(Integer id) {
        return firmMapper.delById(id);
    }

    public int updateById(Firm record) {
        return firmMapper.updateById(record);
    }
}
