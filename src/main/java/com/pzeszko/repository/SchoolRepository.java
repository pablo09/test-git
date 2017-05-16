package com.pzeszko.repository;

import com.pzeszko.model.school.Address;
import com.pzeszko.model.school.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

/**
 * Created by Admin on 11.05.2017.
 */
@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

    Stream<School> findByAddress(Address address);

    @Query("UPDATE School s SET s.address = null WHERE s.address = ?1")
    @Modifying
    void removeAddressReferences(Address address);
}
