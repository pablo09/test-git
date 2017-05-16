package com.pzeszko.repository;

import com.pzeszko.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 03.05.2017.
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface GuitarRepository extends JpaRepository<Guitar, Long> {

    @Query("SELECT new com.pzeszko.model.Guitar(g.id, g.description) FROM Guitar g ")
    List<Guitar> findAllWithLazyContent();

   // @EntityGraph("allJoins")
    @Query("SELECT distinct g FROM Guitar g")
    List<Guitar> findAllJoined();

    @Query("Select g FROM Guitar g JOIN g.pickups p WHERE p.name = 'Texas Deluxe'")
    List<Guitar> findWithJoins();
}
