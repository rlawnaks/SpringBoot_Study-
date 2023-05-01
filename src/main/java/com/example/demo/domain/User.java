package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tbl_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long user_idx;

    @Column(nullable = false, length = 50, name = "user_id")
    private String id;

    @Column(nullable = false, length = 120, name = "user_pw")
    private String pw;

    @Column(nullable = false, length = 20, name = "user_name")
    private String name;

}
