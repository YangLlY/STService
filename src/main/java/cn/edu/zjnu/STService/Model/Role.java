package cn.edu.zjnu.STService.Model;

public class Role {
    private Integer id;

    private String rolecode;

    private String rolename;

    private Integer roletype;

    public Role(Integer id, String rolecode, String rolename, Integer roletype) {
        this.id = id;
        this.rolecode = rolecode;
        this.rolename = rolename;
        this.roletype = roletype;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getRoletype() {
        return roletype;
    }

    public void setRoletype(Integer roletype) {
        this.roletype = roletype;
    }
}