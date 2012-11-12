package com.salesmanager.core.business.reference.zone.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QZoneDescription is a Querydsl query type for ZoneDescription
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QZoneDescription extends EntityPathBase<ZoneDescription> {

    private static final long serialVersionUID = 2106956395;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QZoneDescription zoneDescription = new QZoneDescription("zoneDescription");

    public final com.salesmanager.core.business.common.model.QDescription _super;

    // inherited
    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

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

    public final QZone zone;

    public QZoneDescription(String variable) {
        this(ZoneDescription.class, forVariable(variable), INITS);
    }

    public QZoneDescription(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QZoneDescription(PathMetadata<?> metadata, PathInits inits) {
        this(ZoneDescription.class, metadata, inits);
    }

    public QZoneDescription(Class<? extends ZoneDescription> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.salesmanager.core.business.common.model.QDescription(type, metadata, inits);
        this.auditSection = _super.auditSection;
        this.description = _super.description;
        this.id = _super.id;
        this.language = _super.language;
        this.name = _super.name;
        this.title = _super.title;
        this.zone = inits.isInitialized("zone") ? new QZone(forProperty("zone"), inits.get("zone")) : null;
    }

}

