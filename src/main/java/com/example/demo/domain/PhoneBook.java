package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "tbl_phonebook")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PhoneBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phonebook_idx;

    @ManyToOne
    @JoinColumn(name = "user_idx")
    private User user_idx;

    @Column(nullable = false, length = 11, name = "phonebook_number")
    private String number;

    @Column(nullable = false, length = 20, name = "phonebook_name")
    private String name;

}
