package com.salesmanager.core.business.customer.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = -1297714188;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCustomer customer = new QCustomer("customer");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final BooleanPath anonymous = createBoolean("anonymous");

    public final StringPath city = createString("city");

    public final StringPath company = createString("company");

    public final com.salesmanager.core.business.reference.country.model.QCountry country;

    public final DateTimePath<java.util.Date> dateOfBirth = createDateTime("dateOfBirth", java.util.Date.class);

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath fax = createString("fax");

    public final StringPath firstname = createString("firstname");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastname = createString("lastname");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final ComparablePath<Character> newsletter = createComparable("newsletter", Character.class);

    public final StringPath nick = createString("nick");

    public final StringPath password = createString("password");

    public final StringPath postalCode = createString("postalCode");

    public final ListPath<com.salesmanager.core.business.catalog.product.model.review.ProductReview, com.salesmanager.core.business.catalog.product.model.review.QProductReview> reviews = this.<com.salesmanager.core.business.catalog.product.model.review.ProductReview, com.salesmanager.core.business.catalog.product.model.review.QProductReview>createList("reviews", com.salesmanager.core.business.catalog.product.model.review.ProductReview.class, com.salesmanager.core.business.catalog.product.model.review.QProductReview.class);

    public final StringPath state = createString("state");

    public final StringPath streetAddress = createString("streetAddress");

    public final StringPath telephone = createString("telephone");

    public final com.salesmanager.core.business.reference.zone.model.QZone zone;

    public QCustomer(String variable) {
        this(Customer.class, forVariable(variable), INITS);
    }

    public QCustomer(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata, PathInits inits) {
        this(Customer.class, metadata, inits);
    }

    public QCustomer(Class<? extends Customer> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.country = inits.isInitialized("country") ? new com.salesmanager.core.business.reference.country.model.QCountry(forProperty("country"), inits.get("country")) : null;
        this.zone = inits.isInitialized("zone") ? new com.salesmanager.core.business.reference.zone.model.QZone(forProperty("zone"), inits.get("zone")) : null;
    }

}

