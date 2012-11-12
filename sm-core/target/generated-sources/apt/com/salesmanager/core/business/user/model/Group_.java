package com.salesmanager.core.business.user.model;

import com.salesmanager.core.business.common.model.audit.AuditSection;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Group.class)
public abstract class Group_ {

	public static volatile SingularAttribute<Group, Integer> id;
	public static volatile SingularAttribute<Group, String> groupName;
	public static volatile ListAttribute<Group, Permission> permissions;
	public static volatile SingularAttribute<Group, AuditSection> auditSection;

}

