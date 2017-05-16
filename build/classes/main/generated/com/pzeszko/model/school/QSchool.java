package com.pzeszko.model.school;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSchool is a Querydsl query type for School
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSchool extends EntityPathBase<School> {

    private static final long serialVersionUID = -1108378476L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSchool school = new QSchool("school");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QAddress address;

    public final ListPath<Clazz, QClazz> classes = this.<Clazz, QClazz>createList("classes", Clazz.class, QClazz.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final ListPath<Teacher, QTeacher> teachers = this.<Teacher, QTeacher>createList("teachers", Teacher.class, QTeacher.class, PathInits.DIRECT2);

    public QSchool(String variable) {
        this(School.class, forVariable(variable), INITS);
    }

    public QSchool(Path<? extends School> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSchool(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSchool(PathMetadata<?> metadata, PathInits inits) {
        this(School.class, metadata, inits);
    }

    public QSchool(Class<? extends School> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
    }

}

