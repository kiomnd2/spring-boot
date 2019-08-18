package com.springboot.kiomnd2.chapter3security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader,String> {
}
