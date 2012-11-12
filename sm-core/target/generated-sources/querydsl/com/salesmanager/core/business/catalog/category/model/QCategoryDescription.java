package com.salesmanager.core.business.catalog.category.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCategoryDescription is a Querydsl query type for CategoryDescription
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCategoryDescription extends EntityPathBase<CategoryDescription> {

    private static final long serialVersionUID = 1231250013;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCategoryDescription categoryDescription = new QCategoryDescription("categoryDescription");

    public final com.salesmanager.core.business.common.model.QDescription _super;

    // inherited
    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final QCategory category;

    //inherited
    public final StringPath description;

    //inherited
    public final NumberPath<Long> id;

    // inherited
    public final com.salesmanager.core.business.reference.language.model.QLanguage language;

    public final StringPath metatagDescription = createString("metatagDescription");

    public final StringPath metatagKeywords = createString("metatagKeywords");

    public final StringPath metatagTitle = createString("metatagTitle");

    //inherited
    public final StringPath name;

    public final StringPath seUrl = createString("seUrl");

    //inherited
    public final StringPath title;

    public QCategoryDescription(String variable) {
        this(CategoryDescription.class, forVariable(variable), INITS);
    }

    public QCategoryDescription(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCategoryDescription(PathMetadata<?> metadata, PathInits inits) {
        this(CategoryDescription.class, metadata, inits);
    }

    public QCategoryDescription(Class<? extends CategoryDescription> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.salesmanager.core.business.common.model.QDescription(type, metadata, inits);
        this.auditSection = _super.auditSection;
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category"), inits.get("category")) : null;
        this.description = _super.description;
        this.id = _super.id;
        this.language = _super.language;
        this.name = _super.name;
        this.title = _super.title;
    }

}

