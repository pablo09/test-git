package com.pzeszko.model.school;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QClass is a Querydsl query type for Class
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QClass extends EntityPathBase<Class> {

    private static final long serialVersionUID = -188816296L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClass class$ = new QClass("class$");

    public final StringPath name = createString("name");

    public final QSchool school;

    public final ListPath<Student, QStudent> students = this.<Student, QStudent>createList("students", Student.class, QStudent.class, PathInits.DIRECT2);

    public final QTeacher teacher;

    public QClass(String variable) {
        this(Class.class, forVariable(variable), INITS);
    }

    public QClass(Path<? extends Class> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QClass(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QClass(PathMetadata<?> metadata, PathInits inits) {
        this(Class.class, metadata, inits);
    }

    public QClass(Class<? extends Class> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.school = inits.isInitialized("school") ? new QSchool(forProperty("school"), inits.get("school")) : null;
        this.teacher = inits.isInitialized("teacher") ? new QTeacher(forProperty("teacher"), inits.get("teacher")) : null;
    }

}

