package com.salesmanager.core.business.catalog.product.model.attribute;

import com.salesmanager.core.business.merchant.model.MerchantStore;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProductOption.class)
public abstract class ProductOption_ {

	public static volatile SingularAttribute<ProductOption, Long> id;
	public static volatile SingularAttribute<ProductOption, MerchantStore> merchantSore;
	public static volatile SingularAttribute<ProductOption, String> productOptionType;
	public static volatile SetAttribute<ProductOption, ProductOptionDescription> descriptions;
	public static volatile SingularAttribute<ProductOption, Integer> productOptionSortOrder;

}

