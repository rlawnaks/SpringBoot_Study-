package com.example.demo.service;

import com.example.demo.domain.PhoneBook;
import com.example.demo.domain.User;
import com.example.demo.repository.PhoneBookRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneBookService {

    @Autowired
    PhoneBookRepository phoneBookRepository;

    public List<PhoneBook> findAll() {
        return phoneBookRepository.findAll();
    }

    public PhoneBook findOne(Long idx) {
        return phoneBookRepository.findById(idx).orElse(null);
    }

    public PhoneBook save(PhoneBook phoneBook) {
        return phoneBookRepository.save(phoneBook);
    }

    public void delete(Long idx){
        phoneBookRepository.deleteById(idx);
    }

    public PhoneBook update(Long idx, PhoneBook phoneBook) {
        PhoneBook temp = phoneBookRepository.findById(idx).orElse(null);
        if(temp == null)
            return null;
        phoneBookRepository.deleteById(idx);
        return phoneBookRepository.save(phoneBook);
    }

}
