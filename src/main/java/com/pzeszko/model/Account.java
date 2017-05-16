package com.pzeszko.model;

import com.pzeszko.model.school.Schema;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Admin on 10.05.2017.
 */
@Entity
@Table(schema = Schema.DEFAULT)
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer amount;

    @Version
    private Long version = 0L;
}
