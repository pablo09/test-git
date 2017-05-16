package com.pzeszko.model;

import com.pzeszko.model.school.Schema;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Admin on 09.05.2017.
 */
@Table(schema = Schema.DEFAULT)
@Entity
@ToString
@Data
public class Pickup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
