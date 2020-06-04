package com.news.app.service.impl;


import com.news.app.common.utils.JwtTokenUtil;
import com.news.app.dao.AdminRoleRelationDao;
import com.news.app.dto.AdminLoginParam;
import com.news.app.mbg.mapper.AdminMapper;
import com.news.app.mbg.model.Admin;
import com.news.app.mbg.model.AdminExample;
import com.news.app.mbg.model.Permit;
import com.news.app.mbg.model.Function;
import com.news.app.service.AdminService;

import com.news.app.mbg.model.Adminrole;
import com.news.app.mbg.model.AdminroleExample;
import com.news.app.mbg.mapper.AdminroleMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminRoleRelationDao adminRoleRelationDao;

    @Autowired
    private AdminroleMapper adminroleMapper;

    /**
     * 根据用户名获取后台管理员
     */
    @Override
    public Admin getAdminByUsername(String username){
        AdminExample example = new AdminExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<Admin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    /**
     * 注册功能
     */
    @Override
    public Admin register(Admin adminParam){
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminParam, admin);
        //admin.setCreateTime(new Date());
        admin.setUserStatus(1);

        //查询是否有相同用户名的用户
        AdminExample example = new AdminExample();

        example.createCriteria().andUserNameEqualTo(admin.getUserName());
        List<Admin> umsAdminList = adminMapper.selectByExample(example);

        if (umsAdminList.size() > 0) {
            return null;
        }

        //将密码进行加密操作

        String encodePassword = passwordEncoder.encode(admin.getUserPassword());
        admin.setUserPassword(encodePassword);
        adminMapper.insert(admin);
        return admin;
    }

    /**
     * 登录功能 /////////用上user detail
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    public String login(String username, String password){
        String token = null;
        try {
            LOGGER.info("before loaduser by username");
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            LOGGER.info("before user password authentication");
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            LOGGER.info("before set authentication");
            SecurityContextHolder.getContext().setAuthentication(authentication);
            LOGGER.info("before token generation");
            token = jwtTokenUtil.generateToken(userDetails);

        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        LOGGER.info("after service impl");
        return token;
    }



    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    public List<Function> getPermitList(String adminId){
        return adminRoleRelationDao.getFunctionList(adminId);
    }

    /**
     * 给管理员添加权限
     * @param adminId
     * @param roleId
     * @return
     */
    public int grantRole(String adminId, int roleId){
        //AdminroleExample adminroleExample = new AdminroleExample();
        //adminroleExample.createCriteria().andAdminIdEqualTo(Integer.valueOf(adminId));
        //adminroleMapper.selectByExample(adminroleExample);
        Adminrole adminrole = new Adminrole();
        adminrole.setAdminId(Integer.valueOf(adminId));
        adminrole.setRoleId(roleId);
        return adminroleMapper.insert(adminrole);
    }

    public int dismissRole(String adminId, int roleId){
        AdminroleExample adminroleExample = new AdminroleExample();
        adminroleExample.createCriteria().andAdminIdEqualTo(Integer.valueOf(adminId)).andRoleIdEqualTo(roleId);
        return adminroleMapper.deleteByExample(adminroleExample);
    }
}





