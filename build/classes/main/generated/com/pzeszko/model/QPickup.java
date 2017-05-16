package com.pzeszko.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPickup is a Querydsl query type for Pickup
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPickup extends EntityPathBase<Pickup> {

    private static final long serialVersionUID = -878132202L;

    public static final QPickup pickup = new QPickup("pickup");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QPickup(String variable) {
        super(Pickup.class, forVariable(variable));
    }

    public QPickup(Path<? extends Pickup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPickup(PathMetadata<?> metadata) {
        super(Pickup.class, metadata);
    }

}

