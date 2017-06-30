package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Service.IFirmService;
import cn.edu.zjnu.STService.Utils.Datagrid;
import cn.edu.zjnu.STService.Utils.GsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yly on 2017/3/31.
 */
@Controller
@RequestMapping("/Test")
public class TestController extends BaseController{
    @Resource
    private IFirmService firmService;

    @RequestMapping(value = "/page_dg.do",method = RequestMethod.POST)
    public void PageInfo(Firm firm, @RequestParam(value = "offset",defaultValue = "0")Integer pageNum,
                         @RequestParam(value = "limit",defaultValue = "2")Integer pageSize, HttpServletResponse response) {
        /*offset:页码；limit：每页显示的条数*/
        Datagrid datagrid = firmService.findAllFirm(firm,pageNum,pageSize);
        System.out.println("================datagrid============="+new GsonUtils().toJson(datagrid));
        this.write(response,new GsonUtils().toJson(datagrid));
    }




}
