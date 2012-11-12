package com.salesmanager.core.business.reference.language.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QLanguage is a Querydsl query type for Language
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLanguage extends EntityPathBase<Language> {

    private static final long serialVersionUID = -675770927;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QLanguage language = new QLanguage("language");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final StringPath code = createString("code");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ListPath<com.salesmanager.core.business.merchant.model.MerchantStore, com.salesmanager.core.business.merchant.model.QMerchantStore> stores = this.<com.salesmanager.core.business.merchant.model.MerchantStore, com.salesmanager.core.business.merchant.model.QMerchantStore>createList("stores", com.salesmanager.core.business.merchant.model.MerchantStore.class, com.salesmanager.core.business.merchant.model.QMerchantStore.class);

    public final ListPath<com.salesmanager.core.business.merchant.model.MerchantStore, com.salesmanager.core.business.merchant.model.QMerchantStore> storesDefaultLanguage = this.<com.salesmanager.core.business.merchant.model.MerchantStore, com.salesmanager.core.business.merchant.model.QMerchantStore>createList("storesDefaultLanguage", com.salesmanager.core.business.merchant.model.MerchantStore.class, com.salesmanager.core.business.merchant.model.QMerchantStore.class);

    public QLanguage(String variable) {
        this(Language.class, forVariable(variable), INITS);
    }

    public QLanguage(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLanguage(PathMetadata<?> metadata, PathInits inits) {
        this(Language.class, metadata, inits);
    }

    public QLanguage(Class<? extends Language> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
    }

}

