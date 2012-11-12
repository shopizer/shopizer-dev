package com.salesmanager.core.business.generic.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QSalesManagerEntity is a Querydsl query type for SalesManagerEntity
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QSalesManagerEntity extends BeanPath<SalesManagerEntity<? extends Comparable<?>, ?>> {

    private static final long serialVersionUID = 433632735;

    public static final QSalesManagerEntity salesManagerEntity = new QSalesManagerEntity("salesManagerEntity");

    public final ComparablePath<Comparable<?>> id = createComparable("id", Comparable.class);

    public final BooleanPath new$ = createBoolean("new");

    @SuppressWarnings("unchecked")
    public QSalesManagerEntity(String variable) {
        super((Class)SalesManagerEntity.class, forVariable(variable));
    }

    public QSalesManagerEntity(Path<? extends SalesManagerEntity<? extends Comparable<?>, ?>> entity) {
        super(entity.getType(), entity.getMetadata());
    }

    @SuppressWarnings("unchecked")
    public QSalesManagerEntity(PathMetadata<?> metadata) {
        super((Class)SalesManagerEntity.class, metadata);
    }

}

