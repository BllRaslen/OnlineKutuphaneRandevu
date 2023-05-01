package com.saturn.merkezi.services;



import com.saturn.merkezi.entity.Reader;
import com.saturn.merkezi.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    @Query(value = "select * from reader" , nativeQuery = true)
    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public Reader saveReader(Reader reader) {
        return readerRepository.save(reader);
    }

}
