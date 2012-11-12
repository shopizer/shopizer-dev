package com.salesmanager.core.business.order.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = -1579690742;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrder order = new QOrder("order1");

    public final com.salesmanager.core.business.generic.model.QSalesManagerEntity _super = new com.salesmanager.core.business.generic.model.QSalesManagerEntity(this);

    public final NumberPath<Integer> billingAddressFormatId = createNumber("billingAddressFormatId", Integer.class);

    public final StringPath billingCity = createString("billingCity");

    public final StringPath billingCompany = createString("billingCompany");

    public final StringPath billingCountry = createString("billingCountry");

    public final StringPath billingName = createString("billingName");

    public final StringPath billingPostcode = createString("billingPostcode");

    public final StringPath billingState = createString("billingState");

    public final StringPath billingStreetAddress = createString("billingStreetAddress");

    public final StringPath billingSuburb = createString("billingSuburb");

    public final StringPath cardType = createString("cardType");

    public final StringPath ccCvv = createString("ccCvv");

    public final StringPath ccExpires = createString("ccExpires");

    public final StringPath ccNumber = createString("ccNumber");

    public final StringPath ccOwner = createString("ccOwner");

    public final NumberPath<Integer> channel = createNumber("channel", Integer.class);

    public final StringPath couponCode = createString("couponCode");

    public final com.salesmanager.core.business.reference.currency.model.QCurrency currency;

    public final NumberPath<java.math.BigDecimal> currencyValue = createNumber("currencyValue", java.math.BigDecimal.class);

    public final com.salesmanager.core.business.customer.model.QCustomer customer;

    public final DateTimePath<java.util.Date> datePurchased = createDateTime("datePurchased", java.util.Date.class);

    public final NumberPath<Integer> deliveryAddressFormatId = createNumber("deliveryAddressFormatId", Integer.class);

    public final StringPath deliveryCity = createString("deliveryCity");

    public final StringPath deliveryCompany = createString("deliveryCompany");

    public final StringPath deliveryCountry = createString("deliveryCountry");

    public final StringPath deliveryName = createString("deliveryName");

    public final StringPath deliveryPostcode = createString("deliveryPostcode");

    public final StringPath deliveryState = createString("deliveryState");

    public final StringPath deliveryStreetAddress = createString("deliveryStreetAddress");

    public final StringPath deliverySuburb = createString("deliverySuburb");

    public final BooleanPath displayInvoicePayments = createBoolean("displayInvoicePayments");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipAddress = createString("ipAddress");

    public final DateTimePath<java.util.Date> lastModified = createDateTime("lastModified", java.util.Date.class);

    public final com.salesmanager.core.business.merchant.model.QMerchantStore merchant;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final SetPath<com.salesmanager.core.business.order.model.orderaccount.OrderAccount, com.salesmanager.core.business.order.model.orderaccount.QOrderAccount> orderAccounts = this.<com.salesmanager.core.business.order.model.orderaccount.OrderAccount, com.salesmanager.core.business.order.model.orderaccount.QOrderAccount>createSet("orderAccounts", com.salesmanager.core.business.order.model.orderaccount.OrderAccount.class, com.salesmanager.core.business.order.model.orderaccount.QOrderAccount.class);

    public final DateTimePath<java.util.Date> orderDateFinished = createDateTime("orderDateFinished", java.util.Date.class);

    public final SetPath<com.salesmanager.core.business.order.model.orderstatus.OrderStatusHistory, com.salesmanager.core.business.order.model.orderstatus.QOrderStatusHistory> orderHistory = this.<com.salesmanager.core.business.order.model.orderstatus.OrderStatusHistory, com.salesmanager.core.business.order.model.orderstatus.QOrderStatusHistory>createSet("orderHistory", com.salesmanager.core.business.order.model.orderstatus.OrderStatusHistory.class, com.salesmanager.core.business.order.model.orderstatus.QOrderStatusHistory.class);

    public final SetPath<com.salesmanager.core.business.order.model.orderproduct.OrderProduct, com.salesmanager.core.business.order.model.orderproduct.QOrderProduct> orderProducts = this.<com.salesmanager.core.business.order.model.orderproduct.OrderProduct, com.salesmanager.core.business.order.model.orderproduct.QOrderProduct>createSet("orderProducts", com.salesmanager.core.business.order.model.orderproduct.OrderProduct.class, com.salesmanager.core.business.order.model.orderproduct.QOrderProduct.class);

    public final NumberPath<java.math.BigDecimal> orderTax = createNumber("orderTax", java.math.BigDecimal.class);

    public final SetPath<OrderTotal, QOrderTotal> orderTotal = this.<OrderTotal, QOrderTotal>createSet("orderTotal", OrderTotal.class, QOrderTotal.class);

    public final StringPath paymentMethod = createString("paymentMethod");

    public final StringPath paymentModuleCode = createString("paymentModuleCode");

    public final StringPath shippingMethod = createString("shippingMethod");

    public final StringPath shippingModuleCode = createString("shippingModuleCode");

    public final EnumPath<com.salesmanager.core.business.order.model.orderstatus.OrderStatus> status = createEnum("status", com.salesmanager.core.business.order.model.orderstatus.OrderStatus.class);

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    public QOrder(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrder(PathMetadata<?> metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.currency = inits.isInitialized("currency") ? new com.salesmanager.core.business.reference.currency.model.QCurrency(forProperty("currency")) : null;
        this.customer = inits.isInitialized("customer") ? new com.salesmanager.core.business.customer.model.QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.merchant = inits.isInitialized("merchant") ? new com.salesmanager.core.business.merchant.model.QMerchantStore(forProperty("merchant"), inits.get("merchant")) : null;
    }

}

