package com.capsule.springcloud.cnh.utils;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import lombok.Data;

import java.util.List;

/**
 * 返回分页信息的工具类
 * @author yld
 */
@Data
public class PageUtil {
    /**
     * 当前页
     */
    private Integer pageNum;
    /**
     * 每页容量
     */
    private Integer pageSize;
    /**
     * 全部数量
     */
    private Long totalNum;
    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 分页所得数据
     */
    private List records;

    public PageUtil() {
        this.totalNum = 0L;
        this.totalPages = 0;
    }

    public PageUtil(Page page, List records) {
        this.pageNum = page.getPageNum();
        this.pageSize = page.getPageSize();
        this.totalNum = page.getTotal();
        this.totalPages = page.getPages();
        this.records = records;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
