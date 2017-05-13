package cn.edu.zjnu.STService.Model;

public class RolePriv {
    private Integer id;

    private Integer roleid;

    private Integer privid;

    public RolePriv(Integer id, Integer roleid, Integer privid) {
        this.id = id;
        this.roleid = roleid;
        this.privid = privid;
    }

    public RolePriv() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPrivid() {
        return privid;
    }

    public void setPrivid(Integer privid) {
        this.privid = privid;
    }
}