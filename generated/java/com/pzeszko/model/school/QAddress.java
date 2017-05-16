package com.pzeszko.model.school;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAddress is a Querydsl query type for Address
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAddress extends EntityPathBase<Address> {

    private static final long serialVersionUID = 1229823700L;

    public static final QAddress address = new QAddress("address");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath city = createString("city");

    public final StringPath country = createString("country");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath street = createString("street");

    public QAddress(String variable) {
        super(Address.class, forVariable(variable));
    }

    public QAddress(Path<? extends Address> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddress(PathMetadata<?> metadata) {
        super(Address.class, metadata);
    }

}

