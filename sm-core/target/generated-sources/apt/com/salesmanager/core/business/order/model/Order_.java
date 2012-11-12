package com.salesmanager.core.business.order.model;

import com.salesmanager.core.business.customer.model.Customer;
import com.salesmanager.core.business.merchant.model.MerchantStore;
import com.salesmanager.core.business.order.model.orderaccount.OrderAccount;
import com.salesmanager.core.business.order.model.orderproduct.OrderProduct;
import com.salesmanager.core.business.order.model.orderstatus.OrderStatus;
import com.salesmanager.core.business.order.model.orderstatus.OrderStatusHistory;
import com.salesmanager.core.business.reference.currency.model.Currency;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, BigDecimal> total;
	public static volatile SetAttribute<Order, OrderTotal> orderTotal;
	public static volatile SingularAttribute<Order, String> billingSuburb;
	public static volatile SingularAttribute<Order, Integer> billingAddressFormatId;
	public static volatile SingularAttribute<Order, Boolean> displayInvoicePayments;
	public static volatile SingularAttribute<Order, String> deliveryState;
	public static volatile SingularAttribute<Order, String> ccExpires;
	public static volatile SingularAttribute<Order, String> deliveryName;
	public static volatile SingularAttribute<Order, Customer> customer;
	public static volatile SingularAttribute<Order, String> billingState;
	public static volatile SingularAttribute<Order, Date> orderDateFinished;
	public static volatile SingularAttribute<Order, Currency> currency;
	public static volatile SingularAttribute<Order, Long> id;
	public static volatile SingularAttribute<Order, Integer> deliveryAddressFormatId;
	public static volatile SingularAttribute<Order, String> billingStreetAddress;
	public static volatile SingularAttribute<Order, String> billingCity;
	public static volatile SetAttribute<Order, OrderProduct> orderProducts;
	public static volatile SingularAttribute<Order, String> deliveryStreetAddress;
	public static volatile SingularAttribute<Order, String> billingCountry;
	public static volatile SetAttribute<Order, OrderStatusHistory> orderHistory;
	public static volatile SetAttribute<Order, OrderAccount> orderAccounts;
	public static volatile SingularAttribute<Order, String> deliveryCity;
	public static volatile SingularAttribute<Order, String> ipAddress;
	public static volatile SingularAttribute<Order, String> paymentModuleCode;
	public static volatile SingularAttribute<Order, String> shippingModuleCode;
	public static volatile SingularAttribute<Order, String> billingCompany;
	public static volatile SingularAttribute<Order, Date> lastModified;
	public static volatile SingularAttribute<Order, MerchantStore> merchant;
	public static volatile SingularAttribute<Order, OrderStatus> status;
	public static volatile SingularAttribute<Order, String> ccCvv;
	public static volatile SingularAttribute<Order, BigDecimal> orderTax;
	public static volatile SingularAttribute<Order, Date> datePurchased;
	public static volatile SingularAttribute<Order, String> deliveryPostcode;
	public static volatile SingularAttribute<Order, String> couponCode;
	public static volatile SingularAttribute<Order, String> deliveryCountry;
	public static volatile SingularAttribute<Order, String> shippingMethod;
	public static volatile SingularAttribute<Order, BigDecimal> currencyValue;
	public static volatile SingularAttribute<Order, String> deliverySuburb;
	public static volatile SingularAttribute<Order, String> cardType;
	public static volatile SingularAttribute<Order, String> billingPostcode;
	public static volatile SingularAttribute<Order, String> ccNumber;
	public static volatile SingularAttribute<Order, String> ccOwner;
	public static volatile SingularAttribute<Order, String> deliveryCompany;
	public static volatile SingularAttribute<Order, Integer> channel;
	public static volatile SingularAttribute<Order, String> billingName;
	public static volatile SingularAttribute<Order, String> paymentMethod;

}

