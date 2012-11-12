package com.salesmanager.core.business.system.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QMerchantConfiguration is a Querydsl query type for MerchantConfiguration
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMerchantConfiguration extends EntityPathBase<MerchantConfiguration> {

    private static final long serialVersionUID = -1611576759;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QMerchantConfiguration merchantConfiguration = new QMerchantConfiguration("merchantConfiguration");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath key = createString("key");

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantSore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath value = createString("value");

    public QMerchantConfiguration(String variable) {
        this(MerchantConfiguration.class, forVariable(variable), INITS);
    }

    public QMerchantConfiguration(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMerchantConfiguration(PathMetadata<?> metadata, PathInits inits) {
        this(MerchantConfiguration.class, metadata, inits);
    }

    public QMerchantConfiguration(Class<? extends MerchantConfiguration> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
        this.merchantSore = inits.isInitialized("merchantSore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantSore"), inits.get("merchantSore")) : null;
    }

}

