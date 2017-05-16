package com.pzeszko.service;

/**
 * Created by Admin on 14.05.2017.
 */
@FunctionalInterface
public interface FancyService {

    String formatFullname(String firstname, String lastname);

    default void sayMyName() {
        System.out.println("Pawka");
    }
}
