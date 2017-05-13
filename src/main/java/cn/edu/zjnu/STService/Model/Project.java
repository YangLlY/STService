package cn.edu.zjnu.STService.Model;

import java.util.Date;

public class Project {
    private Integer proid;

    private String proname;

    private Integer contid;

    private Integer firmid;

    private Integer orderid;

    private Integer materialdirid;

    private Date creattime;

    private String prostatus;

    public Project(Integer proid, String proname, Integer contid, Integer firmid, Integer orderid, Integer materialdirid, Date creattime, String prostatus) {
        this.proid = proid;
        this.proname = proname;
        this.contid = contid;
        this.firmid = firmid;
        this.orderid = orderid;
        this.materialdirid = materialdirid;
        this.creattime = creattime;
        this.prostatus = prostatus;
    }

    public Project() {
        super();
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
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

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getMaterialdirid() {
        return materialdirid;
    }

    public void setMaterialdirid(Integer materialdirid) {
        this.materialdirid = materialdirid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getProstatus() {
        return prostatus;
    }

    public void setProstatus(String prostatus) {
        this.prostatus = prostatus == null ? null : prostatus.trim();
    }
}