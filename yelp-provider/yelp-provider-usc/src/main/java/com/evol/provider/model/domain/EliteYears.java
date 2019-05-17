package com.evol.provider.model.domain;

import javax.persistence.*;

@Table(name = "elite_years")
public class EliteYears {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 精英年度，格式，例：2014
     */
    private String year;

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
     * 获取精英年度，格式，例：2014
     *
     * @return year - 精英年度，格式，例：2014
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置精英年度，格式，例：2014
     *
     * @param year 精英年度，格式，例：2014
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }
}