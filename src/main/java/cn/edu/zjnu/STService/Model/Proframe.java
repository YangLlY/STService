package cn.edu.zjnu.STService.Model;

public class Proframe {
    private Integer id;

    private String proname;

    private String billstandard;

    private String notice;

    private String mgmethod;

    private String publictitle;

    private String publicurl;

    private String materialdirurl;

    private String contracturl;

    public Proframe(Integer id, String proname, String billstandard, String notice, String mgmethod, String publictitle, String publicurl, String materialdirurl, String contracturl) {
        this.id = id;
        this.proname = proname;
        this.billstandard = billstandard;
        this.notice = notice;
        this.mgmethod = mgmethod;
        this.publictitle = publictitle;
        this.publicurl = publicurl;
        this.materialdirurl = materialdirurl;
        this.contracturl = contracturl;
    }

    public Proframe() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getBillstandard() {
        return billstandard;
    }

    public void setBillstandard(String billstandard) {
        this.billstandard = billstandard == null ? null : billstandard.trim();
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public String getMgmethod() {
        return mgmethod;
    }

    public void setMgmethod(String mgmethod) {
        this.mgmethod = mgmethod == null ? null : mgmethod.trim();
    }

    public String getPublictitle() {
        return publictitle;
    }

    public void setPublictitle(String publictitle) {
        this.publictitle = publictitle == null ? null : publictitle.trim();
    }

    public String getPublicurl() {
        return publicurl;
    }

    public void setPublicurl(String publicurl) {
        this.publicurl = publicurl == null ? null : publicurl.trim();
    }

    public String getMaterialdirurl() {
        return materialdirurl;
    }

    public void setMaterialdirurl(String materialdirurl) {
        this.materialdirurl = materialdirurl == null ? null : materialdirurl.trim();
    }

    public String getContracturl() {
        return contracturl;
    }

    public void setContracturl(String contracturl) {
        this.contracturl = contracturl == null ? null : contracturl.trim();
    }
}