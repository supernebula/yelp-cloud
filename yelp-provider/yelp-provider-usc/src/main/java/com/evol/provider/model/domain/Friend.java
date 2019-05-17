package com.evol.provider.model.domain;

import javax.persistence.*;

public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 朋友的用户编号
     */
    @Column(name = "friend_id")
    private String friendId;

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
     * 获取朋友的用户编号
     *
     * @return friend_id - 朋友的用户编号
     */
    public String getFriendId() {
        return friendId;
    }

    /**
     * 设置朋友的用户编号
     *
     * @param friendId 朋友的用户编号
     */
    public void setFriendId(String friendId) {
        this.friendId = friendId == null ? null : friendId.trim();
    }
}