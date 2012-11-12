package com.salesmanager.core.business.tax.model.taxrate;

import com.salesmanager.core.business.common.model.audit.AuditSection;
import com.salesmanager.core.business.merchant.model.MerchantStore;
import com.salesmanager.core.business.reference.geozone.model.GeoZone;
import com.salesmanager.core.business.tax.model.taxclass.TaxClass;
import java.math.BigDecimal;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TaxRate.class)
public abstract class TaxRate_ {

	public static volatile SingularAttribute<TaxRate, Long> id;
	public static volatile SingularAttribute<TaxRate, MerchantStore> merchantSore;
	public static volatile SingularAttribute<TaxRate, Boolean> piggyback;
	public static volatile SingularAttribute<TaxRate, GeoZone> geoZone;
	public static volatile SingularAttribute<TaxRate, TaxClass> taxClass;
	public static volatile SingularAttribute<TaxRate, BigDecimal> taxRate;
	public static volatile SingularAttribute<TaxRate, Integer> taxPriority;
	public static volatile ListAttribute<TaxRate, TaxRateDescription> descriptions;
	public static volatile SingularAttribute<TaxRate, AuditSection> auditSection;

}

