package com.news.app.dto;



import com.news.app.mbg.model.Admin;
import com.news.app.mbg.model.Permit;
import com.news.app.mbg.model.Function;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class AdminUserDetails implements UserDetails {
    private Admin Admin;
    private List<Function> functionList;
    public AdminUserDetails(Admin umsAdmin, List<Function> functionList) {
        this.Admin = umsAdmin;
        this.functionList = functionList;
    }

    //////////////////
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return functionList.stream()
                .filter(function -> function.getFunctionName()!=null)
                .map(function ->new SimpleGrantedAuthority(function.getFunctionName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return Admin.getUserPassword();
    }

    @Override
    public String getUsername() {
        return Admin.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return Admin.getUserStatus().equals(1);
    }
}
