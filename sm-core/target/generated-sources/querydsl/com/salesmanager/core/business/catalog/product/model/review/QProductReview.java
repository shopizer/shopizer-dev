package com.salesmanager.core.business.catalog.product.model.review;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QProductReview is a Querydsl query type for ProductReview
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductReview extends EntityPathBase<ProductReview> {

    private static final long serialVersionUID = 531701897;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QProductReview productReview = new QProductReview("productReview");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection audit;

    public final com.salesmanager.core.business.customer.model.QCustomer customer;

    public final SetPath<ProductReviewDescription, QProductReviewDescription> descriptions = this.<ProductReviewDescription, QProductReviewDescription>createSet("descriptions", ProductReviewDescription.class, QProductReviewDescription.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final com.salesmanager.core.business.catalog.product.model.QProduct product;

    public final NumberPath<Integer> reviewRating = createNumber("reviewRating", Integer.class);

    public final NumberPath<Long> reviewRead = createNumber("reviewRead", Long.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QProductReview(String variable) {
        this(ProductReview.class, forVariable(variable), INITS);
    }

    public QProductReview(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductReview(PathMetadata<?> metadata, PathInits inits) {
        this(ProductReview.class, metadata, inits);
    }

    public QProductReview(Class<? extends ProductReview> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.audit = inits.isInitialized("audit") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("audit")) : null;
        this.customer = inits.isInitialized("customer") ? new com.salesmanager.core.business.customer.model.QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.product = inits.isInitialized("product") ? new com.salesmanager.core.business.catalog.product.model.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

