package com.salesmanager.core.business.tax.model.taxrate;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QTaxRate is a Querydsl query type for TaxRate
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTaxRate extends EntityPathBase<TaxRate> {

    private static final long serialVersionUID = -927761695;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QTaxRate taxRate1 = new QTaxRate("taxRate1");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final ListPath<TaxRateDescription, QTaxRateDescription> descriptions = this.<TaxRateDescription, QTaxRateDescription>createList("descriptions", TaxRateDescription.class, QTaxRateDescription.class);

    public final com.salesmanager.core.business.reference.geozone.model.QGeoZone geoZone;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantSore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final BooleanPath piggyback = createBoolean("piggyback");

    public final com.salesmanager.core.business.tax.model.taxclass.QTaxClass taxClass;

    public final NumberPath<Integer> taxPriority = createNumber("taxPriority", Integer.class);

    public final NumberPath<java.math.BigDecimal> taxRate = createNumber("taxRate", java.math.BigDecimal.class);

    public QTaxRate(String variable) {
        this(TaxRate.class, forVariable(variable), INITS);
    }

    public QTaxRate(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTaxRate(PathMetadata<?> metadata, PathInits inits) {
        this(TaxRate.class, metadata, inits);
    }

    public QTaxRate(Class<? extends TaxRate> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
        this.geoZone = inits.isInitialized("geoZone") ? new com.salesmanager.core.business.reference.geozone.model.QGeoZone(forProperty("geoZone")) : null;
        this.merchantSore = inits.isInitialized("merchantSore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantSore"), inits.get("merchantSore")) : null;
        this.taxClass = inits.isInitialized("taxClass") ? new com.salesmanager.core.business.tax.model.taxclass.QTaxClass(forProperty("taxClass"), inits.get("taxClass")) : null;
    }

}

