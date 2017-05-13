package cn.edu.zjnu.STService.Model;

import java.util.Date;

public class Disputes {
    private Integer id;

    private Integer proid;

    private Date creattime;

    private String firmop;

    private String serviceop;

    private String disstatus;

    public Disputes(Integer id, Integer proid, Date creattime, String firmop, String serviceop, String disstatus) {
        this.id = id;
        this.proid = proid;
        this.creattime = creattime;
        this.firmop = firmop;
        this.serviceop = serviceop;
        this.disstatus = disstatus;
    }

    public Disputes() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getFirmop() {
        return firmop;
    }

    public void setFirmop(String firmop) {
        this.firmop = firmop == null ? null : firmop.trim();
    }

    public String getServiceop() {
        return serviceop;
    }

    public void setServiceop(String serviceop) {
        this.serviceop = serviceop == null ? null : serviceop.trim();
    }

    public String getDisstatus() {
        return disstatus;
    }

    public void setDisstatus(String disstatus) {
        this.disstatus = disstatus == null ? null : disstatus.trim();
    }
}