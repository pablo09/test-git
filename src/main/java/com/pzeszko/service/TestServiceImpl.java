package com.pzeszko.service;

import com.pzeszko.model.Guitar;
import com.pzeszko.model.Pickup;
import com.pzeszko.repository.GuitarRepository;
import com.pzeszko.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 09.05.2017.
 */
@Transactional(readOnly = true)
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private GuitarRepository guitarRepository;

    @Autowired
    private PickupRepository pickupRepository;

    @Autowired
    private TestService2 testService2;

    @Override
    public void test() {
//        List<Guitar> guitars = guitarRepository.findAll();
        //List<Guitar> guitars = guitarRepository.findAllJoined();
        List<Guitar> guitars = guitarRepository.findAllWithLazyContent();
//        List<Guitar> guitars = guitarRepository.findWithJoins();
        // guitars.forEach(g -> g.getWood());
        guitars.stream().forEach(g -> System.out.println(g));
    }

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void testTransactions() {
        Pickup p1 = createPickup("Pickup 1");
        Pickup p2 = createPickup("Pickup 2");

        pickupRepository.save(Arrays.asList(p1, p2));
//        pickupRepository.saveAndFlush(p1);
        testService2.addAndSavePickup();
      //  throw new RuntimeException("Ooooops :(");
    }


    private Pickup createPickup(String name) {
        Pickup p = new Pickup();
        p.setName(name);

        return p;
    }
}
