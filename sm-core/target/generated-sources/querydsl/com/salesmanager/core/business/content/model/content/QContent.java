package com.salesmanager.core.business.content.model.content;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QContent is a Querydsl query type for Content
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContent extends EntityPathBase<Content> {

    private static final long serialVersionUID = -1751957141;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QContent content = new QContent("content");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final StringPath code = createString("code");

    public final StringPath contentType = createString("contentType");

    public final ListPath<ContentDescription, QContentDescription> descriptions = this.<ContentDescription, QContentDescription>createList("descriptions", ContentDescription.class, QContentDescription.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchantSore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final BooleanPath visible = createBoolean("visible");

    public QContent(String variable) {
        this(Content.class, forVariable(variable), INITS);
    }

    public QContent(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContent(PathMetadata<?> metadata, PathInits inits) {
        this(Content.class, metadata, inits);
    }

    public QContent(Class<? extends Content> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
        this.merchantSore = inits.isInitialized("merchantSore") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchantSore"), inits.get("merchantSore")) : null;
    }

}

