package com.salesmanager.core.business.reference.country.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCountryDescription is a Querydsl query type for CountryDescription
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCountryDescription extends EntityPathBase<CountryDescription> {

    private static final long serialVersionUID = -1755941179;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCountryDescription countryDescription = new QCountryDescription("countryDescription");

    public final com.salesmanager.core.business.common.model.QDescription _super;

    // inherited
    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final QCountry country;

    //inherited
    public final StringPath description;

    //inherited
    public final NumberPath<Long> id;

    // inherited
    public final com.salesmanager.core.business.reference.language.model.QLanguage language;

    //inherited
    public final StringPath name;

    //inherited
    public final StringPath title;

    public QCountryDescription(String variable) {
        this(CountryDescription.class, forVariable(variable), INITS);
    }

    public QCountryDescription(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCountryDescription(PathMetadata<?> metadata, PathInits inits) {
        this(CountryDescription.class, metadata, inits);
    }

    public QCountryDescription(Class<? extends CountryDescription> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.salesmanager.core.business.common.model.QDescription(type, metadata, inits);
        this.auditSection = _super.auditSection;
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country"), inits.get("country")) : null;
        this.description = _super.description;
        this.id = _super.id;
        this.language = _super.language;
        this.name = _super.name;
        this.title = _super.title;
    }

}

