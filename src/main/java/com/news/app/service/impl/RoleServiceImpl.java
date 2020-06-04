package com.news.app.service.impl;

//import com.news.app.service.RoleService;

import com.news.app.mbg.model.NewsExample;
import com.news.app.mbg.model.Role;
import com.news.app.mbg.model.RoleExample;


import com.news.app.mbg.mapper.PermitMapper;
import com.news.app.mbg.model.Permit;
import com.news.app.mbg.model.PermitExample;

import com.news.app.mbg.mapper.RoleMapper;
import com.news.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermitMapper permitMapper;

    @Override
    public List<Role> listAllRole(){
        return roleMapper.selectByExample(new RoleExample());
    }

    public int createRole(List<Integer> functionId, Role role){

        Iterator iter = functionId.iterator();
        Permit permit = new Permit();
        while(iter.hasNext()){
            permit.setFunctionId((int)iter.next());
            permit.setRoleId(role.getRoleId());
            permitMapper.insert(permit);
        }
        return roleMapper.insert(role);
    }


}
