package cn.edu.zjnu.STService.Service;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Utils.Datagrid;

import java.util.List;

/**
 * Created by yly on 2017/5/13.
 */
public interface IFirmService {
    Firm findOneByName(String name);

    int add(Firm record);

    int delById(Integer id);

    int updateById(Firm record);

   Datagrid findAllFirm(Firm firm,int pageNum,int pageSize);
}
