package com.pzeszko.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGuitar is a Querydsl query type for Guitar
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGuitar extends EntityPathBase<Guitar> {

    private static final long serialVersionUID = -1124525532L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGuitar guitar = new QGuitar("guitar");

    public final ArrayPath<byte[], Byte> content = createArray("content", byte[].class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Pickup, QPickup> pickups = this.<Pickup, QPickup>createList("pickups", Pickup.class, QPickup.class, PathInits.DIRECT2);

    public final QWood wood;

    public QGuitar(String variable) {
        this(Guitar.class, forVariable(variable), INITS);
    }

    public QGuitar(Path<? extends Guitar> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGuitar(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGuitar(PathMetadata<?> metadata, PathInits inits) {
        this(Guitar.class, metadata, inits);
    }

    public QGuitar(Class<? extends Guitar> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.wood = inits.isInitialized("wood") ? new QWood(forProperty("wood"), inits.get("wood")) : null;
    }

}

