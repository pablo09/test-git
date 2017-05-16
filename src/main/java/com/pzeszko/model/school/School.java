package com.pzeszko.model.school;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 11.05.2017.
 */
@Entity
@Table(name = "SCHOOL", schema = Schema.SCHOOL)
@Data
@ToString(exclude = {"teachers", "classes"})
@EqualsAndHashCode(callSuper = true)
public class School extends BaseEntity {

    private String name;

    @OneToOne
    @JoinColumn(name = "address")
    private Address address;

    @ManyToMany
    @JoinTable(name = "SCHOOL_TEACHER", schema = Schema.SCHOOL,
            joinColumns = @JoinColumn(name = "SCHOOL_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID"))
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Clazz> classes;

    public void dismissTeacher(Teacher teacher) {
        if(!teachers.contains(teacher)) throw new IllegalArgumentException("Teacher is not hired in this school");

        teachers.remove(teacher);
    }

}
