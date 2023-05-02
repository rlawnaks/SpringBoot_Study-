package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "tbl_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_idx;

    @Column(nullable = false, length = 50, name = "user_id")
    private String id;

    @Column(nullable = false, length = 120, name = "user_pw")
    private String pw;

    @Column(nullable = false, length = 20, name = "user_name")
    private String name;

}
