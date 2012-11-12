package com.salesmanager.core.business.order.model.orderproduct;

import com.salesmanager.core.business.catalog.product.model.attribute.ProductOption;
import com.salesmanager.core.business.catalog.product.model.attribute.ProductOptionValue;
import java.math.BigDecimal;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OrderProductAttribute.class)
public abstract class OrderProductAttribute_ {

	public static volatile SingularAttribute<OrderProductAttribute, Long> id;
	public static volatile SingularAttribute<OrderProductAttribute, OrderProduct> orderProduct;
	public static volatile SingularAttribute<OrderProductAttribute, Boolean> productAttributeIsFree;
	public static volatile SingularAttribute<OrderProductAttribute, BigDecimal> optionValuePrice;
	public static volatile SingularAttribute<OrderProductAttribute, ProductOptionValue> productOptionValue;
	public static volatile SingularAttribute<OrderProductAttribute, BigDecimal> productAttributeWeight;
	public static volatile SingularAttribute<OrderProductAttribute, ProductOption> productOption;

}

