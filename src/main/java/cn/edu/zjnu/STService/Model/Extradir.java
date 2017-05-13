package cn.edu.zjnu.STService.Model;

public class Extradir {
    private Integer extradirid;

    private Integer materialdirid;

    private String firsturl;

    private String secondurl;

    public Extradir(Integer extradirid, Integer materialdirid, String firsturl, String secondurl) {
        this.extradirid = extradirid;
        this.materialdirid = materialdirid;
        this.firsturl = firsturl;
        this.secondurl = secondurl;
    }

    public Extradir() {
        super();
    }

    public Integer getExtradirid() {
        return extradirid;
    }

    public void setExtradirid(Integer extradirid) {
        this.extradirid = extradirid;
    }

    public Integer getMaterialdirid() {
        return materialdirid;
    }

    public void setMaterialdirid(Integer materialdirid) {
        this.materialdirid = materialdirid;
    }

    public String getFirsturl() {
        return firsturl;
    }

    public void setFirsturl(String firsturl) {
        this.firsturl = firsturl == null ? null : firsturl.trim();
    }

    public String getSecondurl() {
        return secondurl;
    }

    public void setSecondurl(String secondurl) {
        this.secondurl = secondurl == null ? null : secondurl.trim();
    }
}