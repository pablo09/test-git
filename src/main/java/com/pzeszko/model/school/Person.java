package com.pzeszko.model.school;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by Admin on 11.05.2017.
 */
@Embeddable
@Data
public class Person {
    private String firstname;
    private String lastname;
}
