package com.todo.product.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
@Table(name="user")
public class User {

    @Id @GeneratedValue(strategy = AUTO)
    @Column(name="user_id")
    private String userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_pwd")
    private String userPwd;

    @Column
    private String company;

    @Column
    private String position;

    @ManyToMany(fetch = EAGER)
    private List<Role> roles = new ArrayList<>();
}
