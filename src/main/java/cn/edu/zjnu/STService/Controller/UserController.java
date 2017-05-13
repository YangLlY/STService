package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Model.UserFirm;
import cn.edu.zjnu.STService.Service.IFirmService;
import cn.edu.zjnu.STService.Service.IUserBgService;
import cn.edu.zjnu.STService.Service.IUserFirmService;
import cn.edu.zjnu.STService.Service.IUserServicetService;
import cn.edu.zjnu.STService.Model.ResponseObj;
import cn.edu.zjnu.STService.Utils.GsonUtils;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yly on 2017/5/12.
 */
@Controller
@RequestMapping("/user")
public class UserController  extends BaseController{

    @Resource
    private IUserFirmService userFirmService;
    @Resource
    private IUserServicetService userServicetService;
    @Resource
    private IUserBgService userBgService;
    @Resource
    private IFirmService firmService;

    @RequestMapping(value = "/firm_reg.do",method = RequestMethod.POST )
    public void register(HttpServletRequest request, UserFirm userFirm, @Valid Firm firm, BindingResult fErrors, HttpServletResponse response, HttpSession session){
        Map<String,String> fError = new LinkedHashMap<String, String>();

        //判断firm数据格式是否正确
        if(fErrors.hasErrors()){
            //将BindingResult中错误信息返回给页面
            for (FieldError error : fErrors.getFieldErrors()){
                //遍历BindingResult的错误，放入fError对象中
                fError.put(error.getField()+"Error",error.getDefaultMessage());
            }
            //fError对象转成json格式
            String result = new GsonUtils().toJson(fError);
            this.write(response, result);
        }else{
            //firm数据格式正确后，判断此公司是否已存在
            if(firmService.findOneByName(firm.getName()) == null) {
               firmService.add(firm);
                this.write(response, true);
            }else{
                fError.put("nameError","企业已存在");
                //fError对象转成json格式
                String result = new GsonUtils().toJson(fError);
                this.write(response, result);
            }
        }

    }


}
