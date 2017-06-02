package me.sdevil507.vo;

import java.io.Serializable;

/**
 * 分页实体
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaPageVO implements Serializable {

    /**
     * 页码
     */
    private int page = 0;

    /**
     * 每页记录条数
     */
    private int rows = 0;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "JpaPageVO{" +
                "page=" + page +
                ", rows=" + rows +
                '}';
    }
}
