package com.pzeszko.service;

import com.pzeszko.model.Account;
import com.pzeszko.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Admin on 10.05.2017.
 */
@Service
@Transactional(readOnly = true)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    @Override
    public void doubleAmount() {
        Account account = accountRepository.findOne(1L);
        Integer oldAmount = account.getAmount();
        account.setAmount(2 * oldAmount);
    }
}
