package com.pzeszko.optional8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Admin on 16.05.2017.
 */
public class FakeService {

    private FakeRepository fakeRepository;

    public FakeService() {
        this.fakeRepository = new FakeRepository();
    }

    public FakeEntity findEntity(Long id) {
        return fakeRepository.findOne(id).orElseThrow(NotFoundException::new);
    }

    public List<FakeEntity> findAllEntities() {
        return fakeRepository.findAll().collect(Collectors.toList());
    }


}
