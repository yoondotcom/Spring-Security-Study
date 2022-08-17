package com.todo.product.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Role {

    @Id @GeneratedValue(strategy = AUTO)
    private String id;
    private String roleName;

}
