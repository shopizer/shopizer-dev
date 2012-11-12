package com.salesmanager.core.business.customer.model;

import com.salesmanager.core.business.catalog.product.model.review.ProductReview;
import com.salesmanager.core.business.reference.country.model.Country;
import com.salesmanager.core.business.reference.zone.model.Zone;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, Date> dateOfBirth;
	public static volatile SingularAttribute<Customer, String> streetAddress;
	public static volatile ListAttribute<Customer, ProductReview> reviews;
	public static volatile SingularAttribute<Customer, String> fax;
	public static volatile SingularAttribute<Customer, Character> newsletter;
	public static volatile SingularAttribute<Customer, String> state;
	public static volatile SingularAttribute<Customer, String> lastname;
	public static volatile SingularAttribute<Customer, String> emailAddress;
	public static volatile SingularAttribute<Customer, String> firstname;
	public static volatile SingularAttribute<Customer, String> password;
	public static volatile SingularAttribute<Customer, Country> country;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SingularAttribute<Customer, Boolean> anonymous;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, String> postalCode;
	public static volatile SingularAttribute<Customer, String> nick;
	public static volatile SingularAttribute<Customer, String> company;
	public static volatile SingularAttribute<Customer, String> gender;
	public static volatile SingularAttribute<Customer, String> telephone;
	public static volatile SingularAttribute<Customer, Zone> zone;

}

