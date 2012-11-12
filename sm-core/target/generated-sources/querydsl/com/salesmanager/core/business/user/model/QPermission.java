package com.salesmanager.core.business.user.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QPermission is a Querydsl query type for Permission
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPermission extends EntityPathBase<Permission> {

    private static final long serialVersionUID = -780156776;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QPermission permission = new QPermission("permission");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final ListPath<Group, QGroup> groups = this.<Group, QGroup>createList("groups", Group.class, QGroup.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath permissionName = createString("permissionName");

    public QPermission(String variable) {
        this(Permission.class, forVariable(variable), INITS);
    }

    public QPermission(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPermission(PathMetadata<?> metadata, PathInits inits) {
        this(Permission.class, metadata, inits);
    }

    public QPermission(Class<? extends Permission> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
    }

}

