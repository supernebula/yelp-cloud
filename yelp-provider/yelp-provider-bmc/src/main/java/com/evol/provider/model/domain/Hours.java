package com.evol.provider.model.domain;

import javax.persistence.*;

public class Hours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 营业时间，格式：星期几|开始时间-结束时间，例如：Monday|10:00-21:00
     */
    private String hours;

    /**
     * 商家编号
     */
    @Column(name = "business_id")
    private String businessId;

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
     * 获取营业时间，格式：星期几|开始时间-结束时间，例如：Monday|10:00-21:00
     *
     * @return hours - 营业时间，格式：星期几|开始时间-结束时间，例如：Monday|10:00-21:00
     */
    public String getHours() {
        return hours;
    }

    /**
     * 设置营业时间，格式：星期几|开始时间-结束时间，例如：Monday|10:00-21:00
     *
     * @param hours 营业时间，格式：星期几|开始时间-结束时间，例如：Monday|10:00-21:00
     */
    public void setHours(String hours) {
        this.hours = hours == null ? null : hours.trim();
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
}