package com.pzeszko.optional8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Admin on 16.05.2017.
 */
public class FakeRepository {

    private static List<FakeEntity> entites = Arrays.asList(
            new FakeEntity(1L, "Fruits"),
            new FakeEntity(2L, "Penaut Butter")
    );

    public Optional<FakeEntity> findOne(Long id) {
        return entites.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public Stream<FakeEntity> findAll() {
        return entites.stream();
    }
}
