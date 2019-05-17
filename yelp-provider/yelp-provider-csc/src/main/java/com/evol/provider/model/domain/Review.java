package com.evol.provider.model.domain;

import java.util.Date;
import javax.persistence.*;

public class Review {
    /**
     * 	

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 星级
     */
    private Integer stars;

    /**
     * 日期
     */
    private Date date;

    /**
     * 收到的有用票数
     */
    private Integer useful;

    /**
     * 收到的有趣票数
     */
    private Integer funny;

    /**
     * 收到的酷票数
     */
    private Integer cool;

    /**
     * 商家编号
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 正文
     */
    private String text;

    /**
     * 获取	

     *
     * @return id - 	

     */
    public String getId() {
        return id;
    }

    /**
     * 设置	

     *
     * @param id 	

     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取星级
     *
     * @return stars - 星级
     */
    public Integer getStars() {
        return stars;
    }

    /**
     * 设置星级
     *
     * @param stars 星级
     */
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取收到的有用票数
     *
     * @return useful - 收到的有用票数
     */
    public Integer getUseful() {
        return useful;
    }

    /**
     * 设置收到的有用票数
     *
     * @param useful 收到的有用票数
     */
    public void setUseful(Integer useful) {
        this.useful = useful;
    }

    /**
     * 获取收到的有趣票数
     *
     * @return funny - 收到的有趣票数
     */
    public Integer getFunny() {
        return funny;
    }

    /**
     * 设置收到的有趣票数
     *
     * @param funny 收到的有趣票数
     */
    public void setFunny(Integer funny) {
        this.funny = funny;
    }

    /**
     * 获取收到的酷票数
     *
     * @return cool - 收到的酷票数
     */
    public Integer getCool() {
        return cool;
    }

    /**
     * 设置收到的酷票数
     *
     * @param cool 收到的酷票数
     */
    public void setCool(Integer cool) {
        this.cool = cool;
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
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取正文
     *
     * @return text - 正文
     */
    public String getText() {
        return text;
    }

    /**
     * 设置正文
     *
     * @param text 正文
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}