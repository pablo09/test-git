package com.pzeszko.model;

import com.pzeszko.model.school.Schema;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Admin on 09.05.2017.
 */
@Entity
@Table(schema = Schema.DEFAULT)
@ToString(exclude = "guitar")
public class Wood implements Serializable{

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GUITAR_ID")
    private Guitar guitar;

    private String name;

    private LocalDate date;
}
