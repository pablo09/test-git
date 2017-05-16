package com.pzeszko.model.school;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Admin on 11.05.2017.
 */
@Entity
@Table(name = "STUDENT", schema = Schema.SCHOOL)
@Data
@ToString(exclude = {"clazz"})
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseEntity {

    @Embedded
    private Person personalInfo;

    @ManyToOne
    @JoinColumn(name = "CLASS")
    private Clazz clazz;
}
