package com.shx.pojo;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {

    private int totalPage;//总页数
    private Long total;//总记录数
    private int currentPage;//当前页
    private List<T> pageList;//当前页内容

    public Page() {
    }

    public Page(int totalPage, Long total, int currentPage, List<T> pageList) {
        this.totalPage = totalPage;
        this.total = total;
        this.currentPage = currentPage;
        this.pageList = pageList;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
