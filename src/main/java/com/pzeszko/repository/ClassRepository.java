package com.pzeszko.repository;

import com.pzeszko.model.school.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Admin on 11.05.2017.
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface ClassRepository extends JpaRepository<Clazz, String> {
}
