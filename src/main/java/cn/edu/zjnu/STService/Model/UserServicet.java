package cn.edu.zjnu.STService.Model;

import java.util.Date;

public class UserServicet {
    private Integer id;

    private String usename;

    private String password;

    private Integer svtid;

    private Integer roleid;

    private String realname;

    private String idcard;

    private String phonenum;

    private String qq;

    private Date creattime;

    private Integer isdelet;

    public UserServicet(Integer id, String usename, String password, Integer svtid, Integer roleid, String realname, String idcard, String phonenum, String qq, Date creattime, Integer isdelet) {
        this.id = id;
        this.usename = usename;
        this.password = password;
        this.svtid = svtid;
        this.roleid = roleid;
        this.realname = realname;
        this.idcard = idcard;
        this.phonenum = phonenum;
        this.qq = qq;
        this.creattime = creattime;
        this.isdelet = isdelet;
    }

    public UserServicet() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename == null ? null : usename.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSvtid() {
        return svtid;
    }

    public void setSvtid(Integer svtid) {
        this.svtid = svtid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getIsdelet() {
        return isdelet;
    }

    public void setIsdelet(Integer isdelet) {
        this.isdelet = isdelet;
    }
}