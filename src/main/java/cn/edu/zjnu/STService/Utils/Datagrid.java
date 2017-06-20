package cn.edu.zjnu.STService.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Datagrid用于向前台传数据用的类，包括total（总数）和rows（数据）
 * Created by yly on 2017/6/20.
 */
public class Datagrid {
    private long total;
    private List rows = new ArrayList();

    public Datagrid(){
        super();
    }

    public Datagrid(long total, List rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
