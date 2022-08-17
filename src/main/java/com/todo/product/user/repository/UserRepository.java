package com.todo.product.user.repository;

import com.todo.product.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
    User findByUserName(String userName);
}
