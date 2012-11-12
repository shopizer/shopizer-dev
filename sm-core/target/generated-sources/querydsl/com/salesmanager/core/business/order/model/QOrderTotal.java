package com.salesmanager.core.business.order.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderTotal is a Querydsl query type for OrderTotal
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderTotal extends EntityPathBase<OrderTotal> {

    private static final long serialVersionUID = 2057940058;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderTotal orderTotal = new QOrderTotal("orderTotal");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath module = createString("module");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final QOrder order;

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final StringPath text = createString("text");

    public final StringPath title = createString("title");

    public final NumberPath<java.math.BigDecimal> value = createNumber("value", java.math.BigDecimal.class);

    public QOrderTotal(String variable) {
        this(OrderTotal.class, forVariable(variable), INITS);
    }

    public QOrderTotal(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderTotal(PathMetadata<?> metadata, PathInits inits) {
        this(OrderTotal.class, metadata, inits);
    }

    public QOrderTotal(Class<? extends OrderTotal> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrder(forProperty("order"), inits.get("order")) : null;
    }

}

