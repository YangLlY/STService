package cn.edu.zjnu.STService.Controller;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by yly on 2017/5/13.
 */
public class BaseController {
    /**
     * 输出json
     * @param response
     * @param json
     */
    public void write(HttpServletResponse response, String json) {
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/json");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    /**
     * 返回结果消息
     * @param response
     * @param bool
     */
    public void write(HttpServletResponse response,boolean bool) {
        try {
            String json = "{\"success\":\"" + bool + "\"}";
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
