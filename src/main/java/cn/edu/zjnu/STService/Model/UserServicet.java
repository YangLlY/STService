package cn.edu.zjnu.STService.Model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.util.Date;

/*
* 服务团队用户验证类
*
* */
public class UserServicet {
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;

    private Integer svtid;

    private Integer roleid;
    @NotBlank(message = "姓名不能为空")
    private String realname;
    @NotBlank(message = "身份证号码不能为空")
    @Pattern(regexp = "^(\\d{15}|\\d{18})$",message = "身份证号码为15位或者18位")
    private String idcard;
    @NotBlank(message = "手机号码不能为空")
    @Length(min=11,max = 11,message = "手机号码为11位")
    private String phonenum;
    @NotBlank(message = "QQ号码不能为空")
    private String qq;

    private Date creattime;

    private Integer isdelet;

    public UserServicet(Integer id, String username, String password, Integer svtid, Integer roleid, String realname, String idcard, String phonenum, String qq, Date creattime, Integer isdelet) {
        this.id = id;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String usename) {
        this.username = usename == null ? null : usename.trim();
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