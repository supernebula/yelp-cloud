package com.evol.provider.model.domain;

import javax.persistence.*;

public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商家编号
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 标题
     */
    private String caption;

    /**
     * 标签
     */
    private String label;

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
     * 获取标题
     *
     * @return caption - 标题
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 设置标题
     *
     * @param caption 标题
     */
    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}