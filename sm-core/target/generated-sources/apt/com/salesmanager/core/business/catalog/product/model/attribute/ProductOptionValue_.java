package com.salesmanager.core.business.catalog.product.model.attribute;

import com.salesmanager.core.business.merchant.model.MerchantStore;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProductOptionValue.class)
public abstract class ProductOptionValue_ {

	public static volatile SingularAttribute<ProductOptionValue, Integer> productOptionValueSortOrder;
	public static volatile SingularAttribute<ProductOptionValue, Long> id;
	public static volatile SingularAttribute<ProductOptionValue, MerchantStore> merchantSore;
	public static volatile SingularAttribute<ProductOptionValue, String> productOptionValueImage;
	public static volatile SetAttribute<ProductOptionValue, ProductOptionValueDescription> descriptions;

}

