package com.salesmanager.core.business.system.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QSystemNotification is a Querydsl query type for SystemNotification
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSystemNotification extends EntityPathBase<SystemNotification> {

    private static final long serialVersionUID = -1266624417;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QSystemNotification systemNotification = new QSystemNotification("systemNotification");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath key = createString("key");

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantSore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public final com.salesmanager.core.business.user.model.QUser user;

    public final StringPath value = createString("value");

    public QSystemNotification(String variable) {
        this(SystemNotification.class, forVariable(variable), INITS);
    }

    public QSystemNotification(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSystemNotification(PathMetadata<?> metadata, PathInits inits) {
        this(SystemNotification.class, metadata, inits);
    }

    public QSystemNotification(Class<? extends SystemNotification> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
        this.merchantSore = inits.isInitialized("merchantSore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantSore"), inits.get("merchantSore")) : null;
        this.user = inits.isInitialized("user") ? new com.salesmanager.core.business.user.model.QUser(forProperty("user"), inits.get("user")) : null;
    }

}

