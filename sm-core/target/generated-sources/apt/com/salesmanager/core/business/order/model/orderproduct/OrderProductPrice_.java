package com.salesmanager.core.business.order.model.orderproduct;

import java.math.BigDecimal;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OrderProductPrice.class)
public abstract class OrderProductPrice_ {

	public static volatile SingularAttribute<OrderProductPrice, Integer> productPriceTypeId;
	public static volatile SingularAttribute<OrderProductPrice, Long> id;
	public static volatile SingularAttribute<OrderProductPrice, String> productPriceModuleName;
	public static volatile SingularAttribute<OrderProductPrice, OrderProduct> orderProduct;
	public static volatile SingularAttribute<OrderProductPrice, BigDecimal> productPriceAmount;
	public static volatile SingularAttribute<OrderProductPrice, String> productPriceName;
	public static volatile SingularAttribute<OrderProductPrice, Boolean> defaultPrice;
	public static volatile SingularAttribute<OrderProductPrice, Boolean> productHasTax;

}

