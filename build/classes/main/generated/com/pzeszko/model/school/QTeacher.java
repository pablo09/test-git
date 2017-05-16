package com.pzeszko.model.school;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTeacher is a Querydsl query type for Teacher
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTeacher extends EntityPathBase<Teacher> {

    private static final long serialVersionUID = 937938626L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTeacher teacher = new QTeacher("teacher");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<Clazz, QClazz> owningClass = this.<Clazz, QClazz>createList("owningClass", Clazz.class, QClazz.class, PathInits.DIRECT2);

    public final QPerson personalInfo;

    public QTeacher(String variable) {
        this(Teacher.class, forVariable(variable), INITS);
    }

    public QTeacher(Path<? extends Teacher> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTeacher(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTeacher(PathMetadata<?> metadata, PathInits inits) {
        this(Teacher.class, metadata, inits);
    }

    public QTeacher(Class<? extends Teacher> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.personalInfo = inits.isInitialized("personalInfo") ? new QPerson(forProperty("personalInfo")) : null;
    }

}

