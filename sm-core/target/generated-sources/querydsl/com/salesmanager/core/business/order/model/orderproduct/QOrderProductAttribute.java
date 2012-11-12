package com.salesmanager.core.business.order.model.orderproduct;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderProductAttribute is a Querydsl query type for OrderProductAttribute
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderProductAttribute extends EntityPathBase<OrderProductAttribute> {

    private static final long serialVersionUID = -1172650734;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderProductAttribute orderProductAttribute = new QOrderProductAttribute("orderProductAttribute");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> optionValuePrice = createNumber("optionValuePrice", java.math.BigDecimal.class);

    public final QOrderProduct orderProduct;

    public final BooleanPath productAttributeIsFree = createBoolean("productAttributeIsFree");

    public final NumberPath<java.math.BigDecimal> productAttributeWeight = createNumber("productAttributeWeight", java.math.BigDecimal.class);

    public final com.salesmanager.core.business.catalog.product.model.attribute.QProductOption productOption;

    public final com.salesmanager.core.business.catalog.product.model.attribute.QProductOptionValue productOptionValue;

    public QOrderProductAttribute(String variable) {
        this(OrderProductAttribute.class, forVariable(variable), INITS);
    }

    public QOrderProductAttribute(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderProductAttribute(PathMetadata<?> metadata, PathInits inits) {
        this(OrderProductAttribute.class, metadata, inits);
    }

    public QOrderProductAttribute(Class<? extends OrderProductAttribute> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderProduct = inits.isInitialized("orderProduct") ? new QOrderProduct(forProperty("orderProduct"), inits.get("orderProduct")) : null;
        this.productOption = inits.isInitialized("productOption") ? new com.salesmanager.core.business.catalog.product.model.attribute.QProductOption(forProperty("productOption"), inits.get("productOption")) : null;
        this.productOptionValue = inits.isInitialized("productOptionValue") ? new com.salesmanager.core.business.catalog.product.model.attribute.QProductOptionValue(forProperty("productOptionValue"), inits.get("productOptionValue")) : null;
    }

}

