package com.saturn.merkezi.repository;


import com.saturn.merkezi.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ReaderRepository extends JpaRepository<Reader, Long> {
    List<Reader> findAll();
    // add any additional query methods here

}