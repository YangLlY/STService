package cn.edu.zjnu.STService.Model;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer proid;

    private Integer bguserid;

    private Integer taskid;

    private Date creattime;

    private String orderurl;

    public Order(Integer orderid, Integer proid, Integer bguserid, Integer taskid, Date creattime, String orderurl) {
        this.orderid = orderid;
        this.proid = proid;
        this.bguserid = bguserid;
        this.taskid = taskid;
        this.creattime = creattime;
        this.orderurl = orderurl;
    }

    public Order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getBguserid() {
        return bguserid;
    }

    public void setBguserid(Integer bguserid) {
        this.bguserid = bguserid;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getOrderurl() {
        return orderurl;
    }

    public void setOrderurl(String orderurl) {
        this.orderurl = orderurl == null ? null : orderurl.trim();
    }
}