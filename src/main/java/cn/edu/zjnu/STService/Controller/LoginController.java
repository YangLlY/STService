package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.UserBg;
import cn.edu.zjnu.STService.Model.UserFirm;
import cn.edu.zjnu.STService.Model.UserServicet;
import cn.edu.zjnu.STService.Service.Impl.UserBgService;
import cn.edu.zjnu.STService.Service.Impl.UserFirmService;
import cn.edu.zjnu.STService.Service.Impl.UserServicetService;
import cn.edu.zjnu.STService.Utils.GsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yly on 2017/5/15.
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController extends BaseController{
    @Resource
    private UserBgService userBgService;
    @Resource
    private UserFirmService userFirmService;
    @Resource
    private UserServicetService userServicetService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String roleType = request.getParameter("roletype");

        Map<String,String> loginError = new LinkedHashMap<String, String>();

        //判断登录用户名、密码、用户类型，是否为空
        if (userName.isEmpty()||password.isEmpty()||roleType.isEmpty()) {

            if (userName.isEmpty()) {
                loginError.put("usernameerror", "登录名不能为空");
            }
            if (password.isEmpty()) {
                loginError.put("passworderror", "密码不能为空");
            }
            if (roleType.isEmpty()) {
                loginError.put("roletypeerror", "请选择登录用户类型");
            }
            String leresult = new GsonUtils().toJson(loginError);
            this.write(response,leresult);
        }else{
            //根据用户类型，到相应的数据表查找用户
            switch (Integer.parseInt(roleType)){
                case 1:
                    UserFirm userFirm = userFirmService.findOneByUserName(userName);
                    if(userFirm == null) {
                       loginError.put("nameerror","用户不存在");
                        String leresult = new GsonUtils().toJson(loginError);
                        this.write(response,leresult);
                    }else{
                        if (!userFirm.getPassword().equals(password)) {
                            loginError.put("passworderror", "密码错误");
                            String leresult = new GsonUtils().toJson(loginError);
                            this.write(response,leresult);
                        } else {
                            //用户密码正确，session中存入该userFirm信息
                            session.setAttribute("user",userFirm);
                            this.write(response,true);
                        }
                    }
                    break;
                case 2:
                    UserServicet userServicet = userServicetService.findOneByName(userName);
                    if(userServicet == null) {
                        loginError.put("nameerror","用户不存在");
                        String leresult = new GsonUtils().toJson(loginError);
                        this.write(response,leresult);
                    }else{
                        if (!userServicet.getPassword().equals(password)) {
                            loginError.put("passworderror", "密码错误");
                            String leresult = new GsonUtils().toJson(loginError);
                            this.write(response,leresult);
                        } else {
                            //用户密码正确，session中存入该userServicet信息
                            session.setAttribute("user",userServicet);
                            this.write(response,true);
                        }
                    }
                    break;
                case 3:
                    UserBg userBg = userBgService.findOneByName(userName);
                    if(userBg == null) {
                        loginError.put("nameerror","用户不存在");
                        String leresult = new GsonUtils().toJson(loginError);
                        this.write(response,leresult);
                    }else{
                        if (!userBg.getPassword().equals(password)) {
                            loginError.put("passworderror", "密码错误");
                            String leresult = new GsonUtils().toJson(loginError);
                            this.write(response,leresult);
                        } else {
                            //用户密码正确，session中存入该userBg信息
                            session.setAttribute("user",userBg);
                            this.write(response,true);
                        }
                    }
                    break;
            }
        }

    }


}
