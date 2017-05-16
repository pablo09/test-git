package com.pzeszko.service;

import com.pzeszko.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Admin on 11.05.2017.
 */
@Service
@Transactional(readOnly = true)
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public void testMapping() {
        schoolRepository.findAll();
    }

    @Override
    public void testMapping2() {

    }
}
