package com.evol.provider.model.domain;

import javax.persistence.*;

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商家编号
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 类别名称
     */
    private String category;

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
     * 获取类别名称
     *
     * @return category - 类别名称
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置类别名称
     *
     * @param category 类别名称
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}