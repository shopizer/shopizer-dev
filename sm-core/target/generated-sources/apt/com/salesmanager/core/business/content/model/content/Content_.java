package com.salesmanager.core.business.content.model.content;

import com.salesmanager.core.business.common.model.audit.AuditSection;
import com.salesmanager.core.business.merchant.model.MerchantStore;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Content.class)
public abstract class Content_ {

	public static volatile SingularAttribute<Content, Long> id;
	public static volatile SingularAttribute<Content, MerchantStore> merchantSore;
	public static volatile SingularAttribute<Content, Boolean> visible;
	public static volatile SingularAttribute<Content, String> contentType;
	public static volatile SingularAttribute<Content, String> code;
	public static volatile ListAttribute<Content, ContentDescription> descriptions;
	public static volatile SingularAttribute<Content, AuditSection> auditSection;

}
