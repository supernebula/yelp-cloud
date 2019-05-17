package com.evol.provider.model.domain;

import javax.persistence.*;

public class Checkin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商家编号
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 多个日期时间，半角逗号分隔
     */
    private String date;

    private Integer count;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商家编号
     *
     * @return business_id - 商家编号
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置商家编号
     *
     * @param businessId 商家编号
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    /**
     * 获取多个日期时间，半角逗号分隔
     *
     * @return date - 多个日期时间，半角逗号分隔
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置多个日期时间，半角逗号分隔
     *
     * @param date 多个日期时间，半角逗号分隔
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}