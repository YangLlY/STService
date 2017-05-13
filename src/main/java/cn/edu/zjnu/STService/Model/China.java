package cn.edu.zjnu.STService.Model;

public class China {
    private Integer id;

    private String name;

    private Integer pid;

    public China(Integer id, String name, Integer pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public China() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPid() {
        return pid;
    }

}