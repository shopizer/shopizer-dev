package com.salesmanager.core.business.order.model.orderproduct;

import com.salesmanager.core.business.catalog.product.model.Product;
import com.salesmanager.core.business.order.model.Order;
import com.salesmanager.core.business.tax.model.taxclass.TaxClass;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OrderProduct.class)
public abstract class OrderProduct_ {

	public static volatile SingularAttribute<OrderProduct, BigDecimal> soldPrice;
	public static volatile SingularAttribute<OrderProduct, String> productModel;
	public static volatile SingularAttribute<OrderProduct, BigDecimal> onetimeCharge;
	public static volatile SingularAttribute<OrderProduct, BigDecimal> productSpecialNewPrice;
	public static volatile SingularAttribute<OrderProduct, Date> productSpecialDateAvailable;
	public static volatile SetAttribute<OrderProduct, OrderProductDownload> downloads;
	public static volatile SingularAttribute<OrderProduct, Long> id;
	public static volatile SingularAttribute<OrderProduct, Product> product;
	public static volatile SingularAttribute<OrderProduct, Order> order;
	public static volatile SingularAttribute<OrderProduct, TaxClass> tax;
	public static volatile SetAttribute<OrderProduct, OrderProductAttribute> orderAttributes;
	public static volatile SingularAttribute<OrderProduct, Date> productSpecialDateExpire;
	public static volatile SetAttribute<OrderProduct, OrderProductPrice> prices;
	public static volatile SingularAttribute<OrderProduct, Integer> productQuantity;
	public static volatile SingularAttribute<OrderProduct, String> productName;

}

