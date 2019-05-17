package com.evol.provider.model.domain;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 评论数量
     */
    @Column(name = "review_count")
    private Integer reviewCount;

    /**
     * 注册时间
     */
    @Column(name = "yelping_since")
    private Date yelpingSince;

    /**
     * 好友数量
     */
    private Integer useful;

    /**
     * 有趣投票数量
     */
    private Integer funny;

    /**
     * 酷投票数量
     */
    private Integer cool;

    /**
     * 粉丝数量
     */
    private Integer fans;

    /**
     * 平均评分
     */
    @Column(name = "average_stars")
    private Float averageStars;

    @Column(name = "compliment_hot")
    private Integer complimentHot;

    @Column(name = "compliment_more")
    private Integer complimentMore;

    @Column(name = "compliment_profile")
    private Integer complimentProfile;

    @Column(name = "compliment_cute")
    private Integer complimentCute;

    @Column(name = "compliment_list")
    private Integer complimentList;

    @Column(name = "compliment_note")
    private Integer complimentNote;

    @Column(name = "compliment_plain")
    private Integer complimentPlain;

    @Column(name = "compliment_cool")
    private Integer complimentCool;

    @Column(name = "compliment_funny")
    private Integer complimentFunny;

    @Column(name = "compliment_writer")
    private Integer complimentWriter;

    @Column(name = "compliment_photos")
    private Integer complimentPhotos;

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
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取注册时间
     *
     * @return yelping_since - 注册时间
     */
    public Date getYelpingSince() {
        return yelpingSince;
    }

    /**
     * 设置注册时间
     *
     * @param yelpingSince 注册时间
     */
    public void setYelpingSince(Date yelpingSince) {
        this.yelpingSince = yelpingSince;
    }

    /**
     * 获取好友数量
     *
     * @return useful - 好友数量
     */
    public Integer getUseful() {
        return useful;
    }

    /**
     * 设置好友数量
     *
     * @param useful 好友数量
     */
    public void setUseful(Integer useful) {
        this.useful = useful;
    }

    /**
     * 获取有趣投票数量
     *
     * @return funny - 有趣投票数量
     */
    public Integer getFunny() {
        return funny;
    }

    /**
     * 设置有趣投票数量
     *
     * @param funny 有趣投票数量
     */
    public void setFunny(Integer funny) {
        this.funny = funny;
    }

    /**
     * 获取酷投票数量
     *
     * @return cool - 酷投票数量
     */
    public Integer getCool() {
        return cool;
    }

    /**
     * 设置酷投票数量
     *
     * @param cool 酷投票数量
     */
    public void setCool(Integer cool) {
        this.cool = cool;
    }

    /**
     * 获取粉丝数量
     *
     * @return fans - 粉丝数量
     */
    public Integer getFans() {
        return fans;
    }

    /**
     * 设置粉丝数量
     *
     * @param fans 粉丝数量
     */
    public void setFans(Integer fans) {
        this.fans = fans;
    }

    /**
     * 获取平均评分
     *
     * @return average_stars - 平均评分
     */
    public Float getAverageStars() {
        return averageStars;
    }

    /**
     * 设置平均评分
     *
     * @param averageStars 平均评分
     */
    public void setAverageStars(Float averageStars) {
        this.averageStars = averageStars;
    }

    /**
     * @return compliment_hot
     */
    public Integer getComplimentHot() {
        return complimentHot;
    }

    /**
     * @param complimentHot
     */
    public void setComplimentHot(Integer complimentHot) {
        this.complimentHot = complimentHot;
    }

    /**
     * @return compliment_more
     */
    public Integer getComplimentMore() {
        return complimentMore;
    }

    /**
     * @param complimentMore
     */
    public void setComplimentMore(Integer complimentMore) {
        this.complimentMore = complimentMore;
    }

    /**
     * @return compliment_profile
     */
    public Integer getComplimentProfile() {
        return complimentProfile;
    }

    /**
     * @param complimentProfile
     */
    public void setComplimentProfile(Integer complimentProfile) {
        this.complimentProfile = complimentProfile;
    }

    /**
     * @return compliment_cute
     */
    public Integer getComplimentCute() {
        return complimentCute;
    }

    /**
     * @param complimentCute
     */
    public void setComplimentCute(Integer complimentCute) {
        this.complimentCute = complimentCute;
    }

    /**
     * @return compliment_list
     */
    public Integer getComplimentList() {
        return complimentList;
    }

    /**
     * @param complimentList
     */
    public void setComplimentList(Integer complimentList) {
        this.complimentList = complimentList;
    }

    /**
     * @return compliment_note
     */
    public Integer getComplimentNote() {
        return complimentNote;
    }

    /**
     * @param complimentNote
     */
    public void setComplimentNote(Integer complimentNote) {
        this.complimentNote = complimentNote;
    }

    /**
     * @return compliment_plain
     */
    public Integer getComplimentPlain() {
        return complimentPlain;
    }

    /**
     * @param complimentPlain
     */
    public void setComplimentPlain(Integer complimentPlain) {
        this.complimentPlain = complimentPlain;
    }

    /**
     * @return compliment_cool
     */
    public Integer getComplimentCool() {
        return complimentCool;
    }

    /**
     * @param complimentCool
     */
    public void setComplimentCool(Integer complimentCool) {
        this.complimentCool = complimentCool;
    }

    /**
     * @return compliment_funny
     */
    public Integer getComplimentFunny() {
        return complimentFunny;
    }

    /**
     * @param complimentFunny
     */
    public void setComplimentFunny(Integer complimentFunny) {
        this.complimentFunny = complimentFunny;
    }

    /**
     * @return compliment_writer
     */
    public Integer getComplimentWriter() {
        return complimentWriter;
    }

    /**
     * @param complimentWriter
     */
    public void setComplimentWriter(Integer complimentWriter) {
        this.complimentWriter = complimentWriter;
    }

    /**
     * @return compliment_photos
     */
    public Integer getComplimentPhotos() {
        return complimentPhotos;
    }

    /**
     * @param complimentPhotos
     */
    public void setComplimentPhotos(Integer complimentPhotos) {
        this.complimentPhotos = complimentPhotos;
    }
}