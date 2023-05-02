package com.example.demo.service;

import com.example.demo.domain.PhoneBook;
import com.example.demo.dto.PhoneBookDto;
import com.example.demo.repository.PhoneBookRepository;
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

    public PhoneBook save(PhoneBookDto phoneBookDto) {
        return phoneBookRepository.save(phoneBookDto.toEntity());
    }

    public void delete(Long idx){
        phoneBookRepository.deleteById(idx);
    }

    public PhoneBook update(Long idx, PhoneBookDto phoneBookDto) {
        PhoneBook find = phoneBookRepository.findById(idx).orElse(null);

        if(find == null) {
            return null;
        }

        return phoneBookRepository.save(phoneBookDto.updateEntity(find));
    }


}
