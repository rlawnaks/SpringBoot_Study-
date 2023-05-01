package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public boolean login(User user) {
        User findUser = userRepository.findUserById(user.getId());
        if(findUser == null)
            return false;
        if(findUser.getPw().equals(user.getPw()))
            return true;
        return false;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(Long idx){
        userRepository.deleteById(idx);
    }

}
