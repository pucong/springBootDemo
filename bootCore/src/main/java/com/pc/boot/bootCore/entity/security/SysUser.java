package com.pc.boot.bootCore.entity.security;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by PC on 2017/7/27.
 */
public class SysUser implements Serializable{
    private static final long serialVersionUID = -3437979488255521390L;

    private Integer id;
    private String username;
    private String password;
    private Long orgId; // 机构id

    private boolean enable;                 //账号是否可用
    private boolean nonLocked;              //账号是否锁定
    private Date credentialsExpiredTime;    //密码过期时间
    private Date accountExpiredTime;        //账号过期时间
    public SysUser(){

    }
    public SysUser(SysUser user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.id = user.getId();
        this.enable = user.isEnable();
        this.nonLocked = user.isNonLocked();
        this.credentialsExpiredTime = user.getCredentialsExpiredTime();
        this.accountExpiredTime = user.getAccountExpiredTime();
    }

    public SysUser(Integer id,String username,String password){
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isNonLocked() {
        return nonLocked;
    }

    public void setNonLocked(boolean nonLocked) {
        this.nonLocked = nonLocked;
    }

    public Date getCredentialsExpiredTime() {
        return credentialsExpiredTime;
    }

    public void setCredentialsExpiredTime(Date credentialsExpiredTime) {
        this.credentialsExpiredTime = credentialsExpiredTime;
    }

    public Date getAccountExpiredTime() {
        return accountExpiredTime;
    }

    public void setAccountExpiredTime(Date accountExpiredTime) {
        this.accountExpiredTime = accountExpiredTime;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
