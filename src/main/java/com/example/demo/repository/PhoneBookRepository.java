package com.example.demo.repository;

import com.example.demo.domain.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Long> {
}
