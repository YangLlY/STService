package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.Firm;
import cn.edu.zjnu.STService.Model.Serviceteam;
import cn.edu.zjnu.STService.Model.UserFirm;
import cn.edu.zjnu.STService.Model.UserServicet;
import cn.edu.zjnu.STService.Service.*;
import cn.edu.zjnu.STService.Utils.GsonUtils;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yly on 2017/5/12.
 */
@Controller
@RequestMapping("/regsiter")
public class RegisterController extends BaseController{

    @Resource
    private IUserFirmService userFirmService;
    @Resource
    private IUserServicetService userServicetService;
    @Resource
    private IFirmService firmService;
    @Resource
    private IServiceteamService serviceteamService;

    /*
    * 企业注册
    *
    * */
    @RequestMapping(value = "/firm_reg.do",method = RequestMethod.POST )
    public void fregister(HttpServletRequest request, HttpServletResponse response, @Valid UserFirm userFirm,BindingResult ufErrors, @Valid Firm firm, BindingResult fErrors, HttpSession session){
        Map<String,String> fError = new LinkedHashMap<String, String>();
        Map<String,String> ufError = new LinkedHashMap<String, String>();
        //判断注册firm信息数据格式是否正确
        if(fErrors.hasErrors()){
            //将BindingResult中错误信息返回给页面
            for (FieldError error : fErrors.getFieldErrors()){
                //遍历BindingResult的错误，放入fError对象中
                fError.put(error.getField()+"Error",error.getDefaultMessage());
            }
            //fError对象转成json格式
            String fresult = new GsonUtils().toJson(fError);
            this.write(response, fresult);
        }else{
            //firm数据格式正确后，判断此公司是否已存在
            if(firmService.findOneByName(firm.getName()) == null) {
                //判断注册的企业管理用户个人信息userFirm数据格式是否正确
                if(ufErrors.hasErrors()){
                    //将BindingResult中错误信息返回给页面
                    for (FieldError error : ufErrors.getFieldErrors()){
                        //遍历BindingResult的错误，放入ufError对象中
                        ufError.put(error.getField()+"Error",error.getDefaultMessage());
                    }
                    //fError对象转成json格式
                    String ufresult = new GsonUtils().toJson(ufError);
                    this.write(response, ufresult);
                }else{
                    //userFirm数据格式正确后，判断此用户名是否已存在
                    if(userFirmService.findOneByUserName(userFirm.getUsername()) == null) {
                        //添加firm对象中的加入时间
                        firm.setJointime(new Date());
                        //数据库添加公司
                        firmService.add(firm);
                        //添加公司成功后，再添加企业管理用户
                        //添加userFirm对象中的企业Id、角色Id、创建时间、未删除标识
                        userFirm.setFirmid(firmService.findOneByName(firm.getName()).getId());
                        userFirm.setRoleid(10);
                        userFirm.setCreattime(new Date());
                        userFirm.setIsdelet(0);
                        //数据库添加用户
                        userFirmService.add(userFirm);
                        this.write(response, true);
                    }else{
                        ufError.put("usernameError","用户名已存在");
                        //ufError对象转成json格式
                        String ufresult = new GsonUtils().toJson(ufError);
                        this.write(response, ufresult);
                    }
                }

            }else{
                fError.put("nameError","企业已存在");
                //fError对象转成json格式
                String fresult = new GsonUtils().toJson(fError);
                this.write(response, fresult);
            }
        }

    }
    /*
    * 服务团队注册
    *
    * */
    @RequestMapping(value = "/st_reg.do",method = RequestMethod.POST )
    public void stregister(HttpServletRequest request, @Valid UserServicet userServicet, BindingResult usErrors, @Valid Serviceteam serviceTeam, BindingResult stErrors, HttpServletResponse response, HttpSession session){
        Map<String,String> usError = new LinkedHashMap<String, String>();
        Map<String,String> stError = new LinkedHashMap<String, String>();
        //判断注册serviceTeam信息数据格式是否正确
        if(usErrors.hasErrors()){
            //将BindingResult中serviceTeam错误格式信息返回给页面
            for (FieldError error : usErrors.getFieldErrors()){
                //遍历BindingResult的错误，放入usError对象中
                usError.put(error.getField()+"Error",error.getDefaultMessage());
            }
            //usError对象转成json格式
            String usresult = new GsonUtils().toJson(usError);
            this.write(response, usresult);
        }else{
            //serviceTeam数据格式正确后，判断此服务团队是否已存在
            if(serviceteamService.findOneByName(serviceTeam.getName()) == null) {
                //判断注册的服务团队管理用户个人信息userServicet数据格式是否正确
                if(usErrors.hasErrors()){
                    //将BindingResult中错误信息返回给页面
                    for (FieldError error : usErrors.getFieldErrors()){
                        //遍历BindingResult的错误，放入usError对象中
                        usError.put(error.getField()+"Error",error.getDefaultMessage());
                    }
                    //usError对象转成json格式
                    String usresult = new GsonUtils().toJson(usError);
                    this.write(response, usresult);
                }else{
                    //userServicet数据格式正确后，判断此服务团队管理用户名是否已存在
                    if(userServicetService.findOneByName(userServicet.getUsername()) == null) {
                        //数据库添加服务团队
                        serviceteamService.add(serviceTeam);
                        //添加服务团队成功后，再添加服务团队管理用户
                        //添加userServicet对象中的服务团队Id、角色Id、创建时间、未删除标识
                        userServicet.setSvtid(serviceteamService.findOneByName(serviceTeam.getName()).getId());
                        userServicet.setRoleid(10);
                        userServicet.setCreattime(new Date());
                        userServicet.setIsdelet(0);
                        //数据库添加用户
                        userServicetService.add(userServicet);
                        this.write(response, true);
                    }else{
                        usError.put("usernameError","用户名已存在");
                        //ufError对象转成json格式
                        String usresult = new GsonUtils().toJson(usError);
                        this.write(response, usresult);
                    }
                }

            }else{
                stError.put("nameError","服务团队已存在");
                //fError对象转成json格式
                String stresult = new GsonUtils().toJson(stError);
                this.write(response, stresult);
            }
        }

    }


}
