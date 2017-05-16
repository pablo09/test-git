package com.pzeszko.service;

import com.pzeszko.model.Pickup;
import com.pzeszko.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Admin on 10.05.2017.
 */
@Service
@Transactional(readOnly = true)
public class TestService2Impl implements TestService2{

    @Autowired
    private PickupRepository pickupRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addAndSavePickup() {
        Pickup p3 = createPickup("Pickup 3");
        pickupRepository.save(p3);
    }

    private Pickup createPickup(String name) {
        Pickup p = new Pickup();
        p.setName(name);

        return p;
    }
}
