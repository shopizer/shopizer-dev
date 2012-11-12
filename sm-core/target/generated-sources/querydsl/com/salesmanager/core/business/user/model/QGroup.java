package com.salesmanager.core.business.user.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QGroup is a Querydsl query type for Group
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGroup extends EntityPathBase<Group> {

    private static final long serialVersionUID = -1771724266;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QGroup group = new QGroup("group1");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final StringPath groupName = createString("groupName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final ListPath<Permission, QPermission> permissions = this.<Permission, QPermission>createList("permissions", Permission.class, QPermission.class);

    public QGroup(String variable) {
        this(Group.class, forVariable(variable), INITS);
    }

    public QGroup(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroup(PathMetadata<?> metadata, PathInits inits) {
        this(Group.class, metadata, inits);
    }

    public QGroup(Class<? extends Group> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
    }

}

