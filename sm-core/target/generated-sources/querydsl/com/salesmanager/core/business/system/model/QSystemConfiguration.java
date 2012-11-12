package com.salesmanager.core.business.system.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QSystemConfiguration is a Querydsl query type for SystemConfiguration
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSystemConfiguration extends EntityPathBase<SystemConfiguration> {

    private static final long serialVersionUID = 49746946;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QSystemConfiguration systemConfiguration = new QSystemConfiguration("systemConfiguration");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath key = createString("key");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath value = createString("value");

    public QSystemConfiguration(String variable) {
        this(SystemConfiguration.class, forVariable(variable), INITS);
    }

    public QSystemConfiguration(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSystemConfiguration(PathMetadata<?> metadata, PathInits inits) {
        this(SystemConfiguration.class, metadata, inits);
    }

    public QSystemConfiguration(Class<? extends SystemConfiguration> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
    }

}

