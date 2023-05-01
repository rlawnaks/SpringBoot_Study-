package com.example.demo.controller;

import com.example.demo.domain.PhoneBook;
import com.example.demo.domain.User;
import com.example.demo.service.PhoneBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhoneBookController {

    @Autowired
    PhoneBookService phoneBookService;

    @GetMapping(value = "/phone")
    public List<PhoneBook> findAll() {
        return phoneBookService.findAll();
    }

    @GetMapping(value = "/phone/{idx}")
    public PhoneBook findOne(@PathVariable Long idx) {
        return phoneBookService.findOne(idx);
    }

    @PostMapping(value = "/phone")
    public PhoneBook save(@RequestBody PhoneBook phoneBook) {
        return phoneBookService.save(phoneBook);
    }

    @DeleteMapping (value = "/phone/{idx}")
    public void delete(@PathVariable Long idx) {
        phoneBookService.delete(idx);
    }

    @PutMapping(value = "/phone/{idx}")
    public PhoneBook update(@PathVariable Long idx, @RequestBody PhoneBook phoneBook) {
        return phoneBookService.update(idx, phoneBook);
    }

}
