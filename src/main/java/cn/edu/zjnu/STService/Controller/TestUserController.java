package cn.edu.zjnu.STService.Controller;

import cn.edu.zjnu.STService.Model.TestUser;
import cn.edu.zjnu.STService.Service.ITestUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by yly on 2017/3/31.
 */
@Controller
@RequestMapping("/test/user")
public class TestUserController {
    @Resource
    private ITestUserService testUserService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String tologin(HttpServletRequest request, Model model) {

        String userName = request.getParameter("userCode");
        String userPassword = request.getParameter("userPassword");

        TestUser user = this.testUserService.selectByUserName(userName);
        if (user == null) {

            return "error";
        } else if (!user.getUserPassword().equals(userPassword)) {

            return "error";
        } else {

            return "login";
        }

    }




}
