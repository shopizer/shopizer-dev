package com.salesmanager.core.business.order.model.orderproduct;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderProductPrice is a Querydsl query type for OrderProductPrice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderProductPrice extends EntityPathBase<OrderProductPrice> {

    private static final long serialVersionUID = -266438977;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderProductPrice orderProductPrice = new QOrderProductPrice("orderProductPrice");

    public final BooleanPath defaultPrice = createBoolean("defaultPrice");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderProduct orderProduct;

    public final BooleanPath productHasTax = createBoolean("productHasTax");

    public final NumberPath<java.math.BigDecimal> productPriceAmount = createNumber("productPriceAmount", java.math.BigDecimal.class);

    public final StringPath productPriceModuleName = createString("productPriceModuleName");

    public final StringPath productPriceName = createString("productPriceName");

    public final NumberPath<Integer> productPriceTypeId = createNumber("productPriceTypeId", Integer.class);

    public QOrderProductPrice(String variable) {
        this(OrderProductPrice.class, forVariable(variable), INITS);
    }

    public QOrderProductPrice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderProductPrice(PathMetadata<?> metadata, PathInits inits) {
        this(OrderProductPrice.class, metadata, inits);
    }

    public QOrderProductPrice(Class<? extends OrderProductPrice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderProduct = inits.isInitialized("orderProduct") ? new QOrderProduct(forProperty("orderProduct"), inits.get("orderProduct")) : null;
    }

}

