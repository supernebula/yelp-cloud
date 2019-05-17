package com.evol.provider.model.domain;

import javax.persistence.*;

public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商家名称
     */
    private String name;

    /**
     * 街区
     */
    private String neighborhood;

    /**
     * 地址
     */
    private String address;

    /**
     * 城市
     */
    private String city;

    /**
     * 州
     */
    private String state;

    /**
     * 邮政编码
     */
    @Column(name = "postal_code")
    private String postalCode;

    /**
     * 纬度
     */
    private Float latitude;

    /**
     * 精度
     */
    private Float longitude;

    /**
     * 星级
     */
    private Float stars;

    /**
     * 评论数量
     */
    @Column(name = "review_count")
    private Integer reviewCount;

    /**
     * 0：表示关闭，1：表示打开
     */
    @Column(name = "is_open")
    private Byte isOpen;

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
     * 获取商家名称
     *
     * @return name - 商家名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商家名称
     *
     * @param name 商家名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取街区
     *
     * @return neighborhood - 街区
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * 设置街区
     *
     * @param neighborhood 街区
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood == null ? null : neighborhood.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取州
     *
     * @return state - 州
     */
    public String getState() {
        return state;
    }

    /**
     * 设置州
     *
     * @param state 州
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取邮政编码
     *
     * @return postal_code - 邮政编码
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置邮政编码
     *
     * @param postalCode 邮政编码
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取精度
     *
     * @return longitude - 精度
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 设置精度
     *
     * @param longitude 精度
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取星级
     *
     * @return stars - 星级
     */
    public Float getStars() {
        return stars;
    }

    /**
     * 设置星级
     *
     * @param stars 星级
     */
    public void setStars(Float stars) {
        this.stars = stars;
    }

    /**
     * 获取评论数量
     *
     * @return review_count - 评论数量
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * 设置评论数量
     *
     * @param reviewCount 评论数量
     */
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    /**
     * 获取0：表示关闭，1：表示打开
     *
     * @return is_open - 0：表示关闭，1：表示打开
     */
    public Byte getIsOpen() {
        return isOpen;
    }

    /**
     * 设置0：表示关闭，1：表示打开
     *
     * @param isOpen 0：表示关闭，1：表示打开
     */
    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }
}