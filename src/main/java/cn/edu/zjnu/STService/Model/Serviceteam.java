package cn.edu.zjnu.STService.Model;

public class Serviceteam {
    private Integer id;

    private String name;

    private String address;

    private String memo;

    private String openbank;

    private String account;

    private String accountno;

    private Integer cityid;

    private Integer countyid;

    public Serviceteam(Integer id, String name, String address, String memo, String openbank, String account, String accountno, Integer cityid, Integer countyid) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.memo = memo;
        this.openbank = openbank;
        this.account = account;
        this.accountno = accountno;
        this.cityid = cityid;
        this.countyid = countyid;
    }

    public Serviceteam() {
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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