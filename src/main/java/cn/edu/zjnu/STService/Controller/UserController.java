package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Model.UserFirm;
import cn.edu.zjnu.STService.Service.IUserBgService;
import cn.edu.zjnu.STService.Service.IUserFirmService;
import cn.edu.zjnu.STService.Service.IUserServicetService;
import cn.edu.zjnu.STService.Model.ResponseObj;
import cn.edu.zjnu.STService.Utils.GsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by yly on 2017/5/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserFirmService userFirmService;
    @Resource
    private IUserServicetService userServicetService;
    @Resource
    private IUserBgService userBgService;

    private ResponseObj responseObj;

    @RequestMapping(value = "/firm_reg.do",method = RequestMethod.POST )
    public Object register(HttpServletRequest request, UserFirm userFirm, Firm firm,HttpServletResponse response, HttpSession session){
        Object result;
        responseObj = new ResponseObj<UserFirm>();

        if (null == userFirm) {
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg("用户信息不能为空");
            result = new GsonUtils().toJson(responseObj);
            return result;
            //mav.addObject("message","用户信息不能为空！");//加入提示信息
            //return mav;//返回页面
        }
    }


}
