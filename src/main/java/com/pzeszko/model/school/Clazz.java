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
@Table(name = "CLASS", schema = Schema.SCHOOL)
@Data
@ToString(exclude = {"students"})
@EqualsAndHashCode
public class Clazz {

    @Id
    private String name;

    @OneToMany
    @JoinColumn(name = "CLASS")
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "TEACHER")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "SCHOOL")
    private School school;

    public void dismissTeacher() {
        teacher = null;
    }

}
