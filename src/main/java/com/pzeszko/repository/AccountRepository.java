package com.pzeszko.repository;

import com.pzeszko.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;

/**
 * Created by Admin on 10.05.2017.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Account findOne(Long id);
}
