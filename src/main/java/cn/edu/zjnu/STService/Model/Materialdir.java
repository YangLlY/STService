package cn.edu.zjnu.STService.Model;

public class Materialdir {
    private Integer materialdirid;

    private String materialname;

    private String materialurl;

    private String uploadtime;

    public Materialdir(Integer materialdirid, String materialname, String materialurl, String uploadtime) {
        this.materialdirid = materialdirid;
        this.materialname = materialname;
        this.materialurl = materialurl;
        this.uploadtime = uploadtime;
    }

    public Materialdir() {
        super();
    }

    public Integer getMaterialdirid() {
        return materialdirid;
    }

    public void setMaterialdirid(Integer materialdirid) {
        this.materialdirid = materialdirid;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getMaterialurl() {
        return materialurl;
    }

    public void setMaterialurl(String materialurl) {
        this.materialurl = materialurl == null ? null : materialurl.trim();
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }
}