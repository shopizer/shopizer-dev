package com.salesmanager.core.business.order.model.orderproduct;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOrderProductDownload is a Querydsl query type for OrderProductDownload
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderProductDownload extends EntityPathBase<OrderProductDownload> {

    private static final long serialVersionUID = -2074114222;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrderProductDownload orderProductDownload = new QOrderProductDownload("orderProductDownload");

    public final NumberPath<Integer> downloadCount = createNumber("downloadCount", Integer.class);

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxdays = createNumber("maxdays", Integer.class);

    public final QOrderProduct orderProduct;

    public final StringPath orderProductFilename = createString("orderProductFilename");

    public QOrderProductDownload(String variable) {
        this(OrderProductDownload.class, forVariable(variable), INITS);
    }

    public QOrderProductDownload(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderProductDownload(PathMetadata<?> metadata, PathInits inits) {
        this(OrderProductDownload.class, metadata, inits);
    }

    public QOrderProductDownload(Class<? extends OrderProductDownload> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderProduct = inits.isInitialized("orderProduct") ? new QOrderProduct(forProperty("orderProduct"), inits.get("orderProduct")) : null;
    }

}

