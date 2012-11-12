package com.salesmanager.core.business.tax.model.taxclass;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QTaxClass is a Querydsl query type for TaxClass
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTaxClass extends EntityPathBase<TaxClass> {

    private static final long serialVersionUID = 224881223;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QTaxClass taxClass = new QTaxClass("taxClass");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath code = createString("code");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantSore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final ListPath<com.salesmanager.core.business.catalog.product.model.Product, com.salesmanager.core.business.catalog.product.model.QProduct> products = this.<com.salesmanager.core.business.catalog.product.model.Product, com.salesmanager.core.business.catalog.product.model.QProduct>createList("products", com.salesmanager.core.business.catalog.product.model.Product.class, com.salesmanager.core.business.catalog.product.model.QProduct.class);

    public final ListPath<com.salesmanager.core.business.tax.model.taxrate.TaxRate, com.salesmanager.core.business.tax.model.taxrate.QTaxRate> taxRates = this.<com.salesmanager.core.business.tax.model.taxrate.TaxRate, com.salesmanager.core.business.tax.model.taxrate.QTaxRate>createList("taxRates", com.salesmanager.core.business.tax.model.taxrate.TaxRate.class, com.salesmanager.core.business.tax.model.taxrate.QTaxRate.class);

    public final StringPath title = createString("title");

    public QTaxClass(String variable) {
        this(TaxClass.class, forVariable(variable), INITS);
    }

    public QTaxClass(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTaxClass(PathMetadata<?> metadata, PathInits inits) {
        this(TaxClass.class, metadata, inits);
    }

    public QTaxClass(Class<? extends TaxClass> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.merchantSore = inits.isInitialized("merchantSore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantSore"), inits.get("merchantSore")) : null;
    }

}

