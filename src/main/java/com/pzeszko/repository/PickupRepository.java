package com.pzeszko.repository;

import com.pzeszko.model.Pickup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 10.05.2017.
 */
public interface PickupRepository extends JpaRepository<Pickup, Long> {
}
