package me.sdevil507.vo;

import org.springframework.data.domain.Page;

import java.util.List;

/**
 * jpa分页返回实体VO
 *
 * @param <T> PO类型
 * @param <V> VO类型
 */
public class JpaPageResultVO<T, V> {
    /**
     * 当前页数
     */
    private int currentPage;

    /**
     * 总记录数
     */
    private int totalRecords;

    /**
     * 总页数
     */
    private int totalPageSize;

    /**
     * 记录列表
     */
    private List<V> rows;

    /**
     * 分页参数结果集
     *
     * @param page  jpa Page对象
     * @param clazz 结果VO类
     */
    public JpaPageResultVO(Page<T> page, Class<V> clazz) {
        this.currentPage = page.getNumber() + 1;
        this.totalRecords = page.getNumberOfElements();
        this.totalPageSize = page.getTotalPages();
        this.rows = JpaListPO2VO.convert(page.getContent(), clazz);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(int totalPageSize) {
        this.totalPageSize = totalPageSize;
    }

    public List<V> getRows() {
        return rows;
    }

    public void setRows(List<V> rows) {
        this.rows = rows;
    }
}
