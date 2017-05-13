package cn.edu.zjnu.STService.Model;

import java.util.Date;

public class UserLog {
    private Integer id;

    private Integer userid;

    private String username;

    private Integer roleid;

    private String loginip;

    private Date optime;

    private String opmemo;

    public UserLog(Integer id, Integer userid, String username, Integer roleid, String loginip, Date optime, String opmemo) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.roleid = roleid;
        this.loginip = loginip;
        this.optime = optime;
        this.opmemo = opmemo;
    }

    public UserLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public String getOpmemo() {
        return opmemo;
    }

    public void setOpmemo(String opmemo) {
        this.opmemo = opmemo == null ? null : opmemo.trim();
    }
}