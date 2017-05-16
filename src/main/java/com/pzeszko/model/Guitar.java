package com.pzeszko.model;

import com.pzeszko.model.school.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.hibernate.bytecode.internal.javassist.FieldHandled;
import org.hibernate.bytecode.internal.javassist.FieldHandler;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 03.05.2017.
 */
@ToString
@Table(schema = Schema.DEFAULT)
@Entity
@NoArgsConstructor
@NamedEntityGraphs({
        @NamedEntityGraph(name="allJoins", attributeNodes = {
                @NamedAttributeNode("wood"),
                @NamedAttributeNode("pickups")
        }),
        @NamedEntityGraph(name="noJoins", attributeNodes = {

        })
})
public class Guitar implements FieldHandled {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "guitar", optional = false, cascade = CascadeType.ALL)
    @LazyToOne(LazyToOneOption.NO_PROXY)
    private Wood wood;

    @Column(name = "DESCRIPTION")
    private String description;

    @Lob
    @LazyToOne(LazyToOneOption.NO_PROXY)
    @Column(name = "CONTENT")
    private byte[] content;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "GUITAR_ID")
    private List<Pickup> pickups;

    @Transient
    @Getter
    @Setter
    private FieldHandler fieldHandler;

    public Guitar(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public byte[] getContent() {
        if (content != null) {
            return content;
        }
        if (fieldHandler != null) {
            return (byte[]) fieldHandler.readObject(this, "content", content);
        } else {
            return null;
        }
    }

    public Wood getWood() {
        if(wood != null) {
            return null;
        }
        if (fieldHandler != null) {
            return (Wood) fieldHandler.readObject(this, "wood", wood);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "id=" + id +
                ", wood=" + wood +
                ", description='" + description + '\'' +
                ", content=" + Arrays.toString(content) +
                ", pickups=" + pickups +
                ", fieldHandler=" + fieldHandler +
                '}';
    }
}
