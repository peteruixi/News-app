package com.news.app.service;

import com.news.app.mbg.model.Admin;
import com.news.app.mbg.model.Permit;
import com.news.app.mbg.model.Function;

import java.util.List;


/**
 * 后台管理员Service
 *
 */
public interface AdminService {
    /**
     * 根据用户名获取后台管理员
     */
    Admin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    Admin register(Admin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<Function> getPermitList(String adminId);

    /**
     * 给管理员添加角色
     */
    int grantRole(String adminId, int roleId);

    /**
     * 给管理员增加角色
     */
    int dismissRole(String adminID, int roleID);
}
