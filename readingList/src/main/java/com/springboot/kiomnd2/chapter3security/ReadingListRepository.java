package com.springboot.kiomnd2.chapter3security;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(Reader reader);
}
