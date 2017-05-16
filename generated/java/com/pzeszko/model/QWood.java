package com.pzeszko.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QWood is a Querydsl query type for Wood
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QWood extends EntityPathBase<Wood> {

    private static final long serialVersionUID = -1010753849L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWood wood = new QWood("wood");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final QGuitar guitar;

    public final StringPath name = createString("name");

    public QWood(String variable) {
        this(Wood.class, forVariable(variable), INITS);
    }

    public QWood(Path<? extends Wood> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QWood(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QWood(PathMetadata<?> metadata, PathInits inits) {
        this(Wood.class, metadata, inits);
    }

    public QWood(Class<? extends Wood> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.guitar = inits.isInitialized("guitar") ? new QGuitar(forProperty("guitar"), inits.get("guitar")) : null;
    }

}

