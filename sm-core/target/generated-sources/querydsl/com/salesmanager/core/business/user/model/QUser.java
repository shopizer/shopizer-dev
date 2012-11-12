package com.salesmanager.core.business.user.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1328738644;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QUser user = new QUser("user");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath adminEmail = createString("adminEmail");

    public final StringPath adminName = createString("adminName");

    public final StringPath adminPassword = createString("adminPassword");

    public final StringPath answer1 = createString("answer1");

    public final StringPath answer2 = createString("answer2");

    public final StringPath answer3 = createString("answer3");

    public final com.salesmanager.core.business.common.model.audit.QAuditSection auditSection;

    public final com.salesmanager.core.business.reference.language.model.QLanguage defaultLanguage;

    public final StringPath firstName = createString("firstName");

    public final ListPath<Group, QGroup> groups = this.<Group, QGroup>createList("groups", Group.class, QGroup.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath question1 = createString("question1");

    public final StringPath question2 = createString("question2");

    public final StringPath question3 = createString("question3");

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditSection = inits.isInitialized("auditSection") ? new com.salesmanager.core.business.common.model.audit.QAuditSection(forProperty("auditSection")) : null;
        this.defaultLanguage = inits.isInitialized("defaultLanguage") ? new com.salesmanager.core.business.reference.language.model.QLanguage(forProperty("defaultLanguage"), inits.get("defaultLanguage")) : null;
    }

}

