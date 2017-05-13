package cn.edu.zjnu.STService.Model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class Firm {
    private Integer id;
    @NotBlank(message="公司名称不能为空")
    private String name;
    @NotBlank(message = "公司地址不能为空")
    private String address;
    @NotBlank(message = "邮政编码不能为空")
    @Length(min = 6,max = 6,message = "邮政编码为6位数")
    private String postid;

    private String docurl;

    private String openbank;

    private String account;

    private String accountno;
    @NotNull(message = "公司所在城市不能为空")
    private Integer cityid;

    @NotNull(message = "公司所在区（县）不能为空")
    private Integer countyid;

    public Firm(Integer id, String name, String address, String postid, String docurl, String openbank, String account, String accountno, Integer cityid, Integer countyid) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postid = postid;
        this.docurl = docurl;
        this.openbank = openbank;
        this.account = account;
        this.accountno = accountno;
        this.cityid = cityid;
        this.countyid = countyid;
    }

    public Firm() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid == null ? null : postid.trim();
    }

    public String getDocurl() {
        return docurl;
    }

    public void setDocurl(String docurl) {
        this.docurl = docurl == null ? null : docurl.trim();
    }

    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }
}