package com.todo.product.user.service;

import com.todo.product.user.domain.Role;
import com.todo.product.user.domain.User;

import java.util.List;
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
