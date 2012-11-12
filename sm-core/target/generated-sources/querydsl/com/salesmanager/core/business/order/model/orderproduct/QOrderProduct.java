package com.salesmanager.core.business.order.model.orderproduct;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderProduct is a Querydsl query type for OrderProduct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderProduct extends EntityPathBase<OrderProduct> {

    private static final long serialVersionUID = 2061280426;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderProduct orderProduct = new QOrderProduct("orderProduct");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final SetPath<OrderProductDownload, QOrderProductDownload> downloads = this.<OrderProductDownload, QOrderProductDownload>createSet("downloads", OrderProductDownload.class, QOrderProductDownload.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final NumberPath<java.math.BigDecimal> onetimeCharge = createNumber("onetimeCharge", java.math.BigDecimal.class);

    public final com.salesmanager.core.business.order.model.QOrder order;

    public final SetPath<OrderProductAttribute, QOrderProductAttribute> orderAttributes = this.<OrderProductAttribute, QOrderProductAttribute>createSet("orderAttributes", OrderProductAttribute.class, QOrderProductAttribute.class);

    public final SetPath<OrderProductPrice, QOrderProductPrice> prices = this.<OrderProductPrice, QOrderProductPrice>createSet("prices", OrderProductPrice.class, QOrderProductPrice.class);

    public final com.salesmanager.core.business.catalog.product.model.QProduct product;

    public final StringPath productModel = createString("productModel");

    public final StringPath productName = createString("productName");

    public final NumberPath<Integer> productQuantity = createNumber("productQuantity", Integer.class);

    public final DateTimePath<java.util.Date> productSpecialDateAvailable = createDateTime("productSpecialDateAvailable", java.util.Date.class);

    public final DateTimePath<java.util.Date> productSpecialDateExpire = createDateTime("productSpecialDateExpire", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> productSpecialNewPrice = createNumber("productSpecialNewPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> soldPrice = createNumber("soldPrice", java.math.BigDecimal.class);

    public final com.salesmanager.core.business.tax.model.taxclass.QTaxClass tax;

    public QOrderProduct(String variable) {
        this(OrderProduct.class, forVariable(variable), INITS);
    }

    public QOrderProduct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderProduct(PathMetadata<?> metadata, PathInits inits) {
        this(OrderProduct.class, metadata, inits);
    }

    public QOrderProduct(Class<? extends OrderProduct> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new com.salesmanager.core.business.order.model.QOrder(forProperty("order"), inits.get("order")) : null;
        this.product = inits.isInitialized("product") ? new com.salesmanager.core.business.catalog.product.model.QProduct(forProperty("product"), inits.get("product")) : null;
        this.tax = inits.isInitialized("tax") ? new com.salesmanager.core.business.tax.model.taxclass.QTaxClass(forProperty("tax"), inits.get("tax")) : null;
    }

}

