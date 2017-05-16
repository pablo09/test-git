package com.pzeszko.model.school;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QClazz is a Querydsl query type for Clazz
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QClazz extends EntityPathBase<Clazz> {

    private static final long serialVersionUID = -188816072L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClazz clazz = new QClazz("clazz");

    public final StringPath name = createString("name");

    public final QSchool school;

    public final ListPath<Student, QStudent> students = this.<Student, QStudent>createList("students", Student.class, QStudent.class, PathInits.DIRECT2);

    public final QTeacher teacher;

    public QClazz(String variable) {
        this(Clazz.class, forVariable(variable), INITS);
    }

    public QClazz(Path<? extends Clazz> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QClazz(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QClazz(PathMetadata<?> metadata, PathInits inits) {
        this(Clazz.class, metadata, inits);
    }

    public QClazz(Class<? extends Clazz> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.school = inits.isInitialized("school") ? new QSchool(forProperty("school"), inits.get("school")) : null;
        this.teacher = inits.isInitialized("teacher") ? new QTeacher(forProperty("teacher"), inits.get("teacher")) : null;
    }

}

