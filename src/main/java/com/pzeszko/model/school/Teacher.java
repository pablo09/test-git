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
@Table(name = "TEACHER", schema = "SCHOOL")
@Data
@ToString(exclude = "owningClass")
@EqualsAndHashCode(callSuper = true)
public class Teacher extends BaseEntity {

    @Embedded
    private Person personalInfo;

    @OneToMany(mappedBy = "teacher")
    private List<Clazz> owningClass;

    @PreRemove
    private void removeClazzAssociation() {
        owningClass.stream().forEach(c -> c.dismissTeacher());
    }
}
