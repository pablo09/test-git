package com.pzeszko.model.school;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QStudent is a Querydsl query type for Student
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QStudent extends EntityPathBase<Student> {

    private static final long serialVersionUID = 498369819L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudent student = new QStudent("student");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QClass clazz;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QPerson personalInfo;

    public QStudent(String variable) {
        this(Student.class, forVariable(variable), INITS);
    }

    public QStudent(Path<? extends Student> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QStudent(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QStudent(PathMetadata<?> metadata, PathInits inits) {
        this(Student.class, metadata, inits);
    }

    public QStudent(Class<? extends Student> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.clazz = inits.isInitialized("clazz") ? new QClass(forProperty("clazz"), inits.get("clazz")) : null;
        this.personalInfo = inits.isInitialized("personalInfo") ? new QPerson(forProperty("personalInfo")) : null;
    }

}

