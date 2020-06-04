package com.news.app.service;

import com.news.app.mbg.model.Role;
import java.util.List;

public interface RoleService {

    List<Role> listAllRole();

    int createRole(List<Integer> functionId ,Role role);

}
