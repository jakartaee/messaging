module jakarta.messaging {
    // Optional for jakarta.annotation.Resource javadoc refs
    requires static jakarta.annotation;
    // Optional for XA* classes
    requires static transitive java.transaction.xa;

    exports jakarta.jms;
}