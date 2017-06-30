package cn.edu.zjnu.STService.Service.Impl;

import cn.edu.zjnu.STService.Dao.FirmMapper;
import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Service.IFirmService;
import cn.edu.zjnu.STService.Utils.Datagrid;
import cn.edu.zjnu.STService.Utils.GsonUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.List;

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

    public int delById(Integer id) {
        return firmMapper.delById(id);
    }

    public int updateById(Firm record) {
        return firmMapper.updateById(record);
    }

    /*测试分页*/
    public Datagrid findAllFirm(Firm firm, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy("id asc");
        List<Firm> firmList = firmMapper.findAllFirm(firm);
        PageInfo<Firm> pageInfo = new PageInfo<Firm>(firmList);
        Datagrid datagrid = new Datagrid(pageInfo.getTotal(), pageInfo.getList());
        return datagrid;
    }

    public Firm findOneById(Integer id) {
        return firmMapper.findOneById(id);
    }

}
