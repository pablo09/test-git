package com.pzeszko.model.school;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Admin on 11.05.2017.
 */
@Entity
@Table(name = "ADDRESS", schema = Schema.SCHOOL)
@Data
@EqualsAndHashCode(callSuper = true)
public class Address extends BaseEntity {

    private String country;

    private String city;

    private String street;
}
