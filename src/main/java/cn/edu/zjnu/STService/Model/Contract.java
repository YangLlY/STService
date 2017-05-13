package cn.edu.zjnu.STService.Model;

import java.util.Date;

public class Contract {
    private Integer contid;

    private Integer firmid;

    private Integer bguserid;

    private Date creattime;

    private String conturl;

    private String contpicurl;

    public Contract(Integer contid, Integer firmid, Integer bguserid, Date creattime, String conturl, String contpicurl) {
        this.contid = contid;
        this.firmid = firmid;
        this.bguserid = bguserid;
        this.creattime = creattime;
        this.conturl = conturl;
        this.contpicurl = contpicurl;
    }

    public Contract() {
        super();
    }

    public Integer getContid() {
        return contid;
    }

    public void setContid(Integer contid) {
        this.contid = contid;
    }

    public Integer getFirmid() {
        return firmid;
    }

    public void setFirmid(Integer firmid) {
        this.firmid = firmid;
    }

    public Integer getBguserid() {
        return bguserid;
    }

    public void setBguserid(Integer bguserid) {
        this.bguserid = bguserid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getConturl() {
        return conturl;
    }

    public void setConturl(String conturl) {
        this.conturl = conturl == null ? null : conturl.trim();
    }

    public String getContpicurl() {
        return contpicurl;
    }

    public void setContpicurl(String contpicurl) {
        this.contpicurl = contpicurl == null ? null : contpicurl.trim();
    }
}