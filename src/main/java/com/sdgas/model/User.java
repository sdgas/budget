package com.sdgas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author wilson.he
 * @since JDK1.5
 * 2015-02-02.
 */

@Entity
public class User {

    /**
     * 用户编号（佛燃工号）
     */
    public int userId;

    /**
     * 用户名字
     */
    private String userName;

    @Id
    @Column(length = 6)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
