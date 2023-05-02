package com.example.demo.dto;

import com.example.demo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String id;
    private String pw;
    private String name;

    public User toEntity() {
        return User.builder()
                .name(getName())
                .id(getId())
                .pw(getPw())
                .build();
    }


}
