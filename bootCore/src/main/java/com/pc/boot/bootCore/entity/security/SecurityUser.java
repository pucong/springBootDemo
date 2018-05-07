package com.pc.boot.bootCore.entity.security;

import com.pc.config.security.SpringContextHelper;
import com.pc.config.security.UserAuthority;
import com.pc.system.mapper.PermissionDao;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

/**
 * 这是一个springsecurity 使用的user对象
 */
public class SecurityUser extends SysUser implements UserDetails {

    private static final long serialVersionUID = -1324734082819961114L;

    private List<Map<String,String>> orgs;

    private List<SysRole> roles;


    public SecurityUser(SysUser user) {
        super(user);
        roles = SpringContextHelper.getBeanByType(PermissionDao.class).findRoleByAdminUserId(user.getId());
    }

    public SecurityUser(Integer id, String username, String password) {
        super(id, username, password);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (roles != null) {
            for (SysRole role : roles) {
                UserAuthority authority = new UserAuthority(role.getName(), role.getId());
                authorities.add(authority);
            }
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.getAccountExpiredTime().getTime()>new Date().getTime();
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.isNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.getCredentialsExpiredTime().getTime()>new Date().getTime();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnable();
    }
}
