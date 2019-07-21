/*
 * Copyright (c) 2012, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.jms;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * An application may use this annotation to specify a Jakarta Messaging {@code
 * ConnectionFactory} resource that it requires in its operational environment. This provides information that can be
 * used at the application's deployment to provision the required resource and allows an application to be deployed into
 * a Jakarta EE environment with more minimal administrative configuration.
 * <p>
 * The {@code ConnectionFactory} resource may be configured by setting the annotation elements for commonly used
 * properties. Additional properties may be specified using the {@code properties} element. Once defined, a
 * {@code ConnectionFactory} resource may be referenced by a component in the same way as any other
 * {@code ConnectionFactory} resource, for example by using the {@code lookup} element of the {@code Resource}
 * annotation.
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 2.0
 *
 * @see javax.annotation.Resource
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface JMSConnectionFactoryDefinition {

    /**
     * Description of this Jakarta Messaging connection factory.
     *
     * @return The description of this Jakarta Messaging connection factory.
     */
    String description() default "";

    /**
     * JNDI name of the Jakarta Messaging connection factory being defined.
     *
     * @return The JNDI name of the Jakarta Messaging connection factory being defined.
     */
    String name();

    /**
     * Fully qualified name of the Jakarta Messaging connection factory interface. Permitted values are
     * {@code javax.jms.ConnectionFactory} or {@code javax.jms.QueueConnectionFactory} or
     * {@code javax.jms.TopicConnectionFactory}. If not specified then {@code javax.jms.ConnectionFactory} will be used.
     *
     * @return The fully qualified name of the Jakarta Messaging connection factory interface.
     */
    String interfaceName() default "javax.jms.ConnectionFactory";

    /**
     * Fully-qualified name of the Jakarta Messaging connection factory implementation class. Ignored if a resource adapter is used.
     *
     * @return The fully-qualified name of the Jakarta Messaging connection factory implementation class.
     */
    String className() default "";

    /**
     * Resource adapter name. If not specified then the application server will define the default behaviour, which may or
     * may not involve the use of a resource adapter.
     *
     * @return The resource adapter name.
     */
    String resourceAdapter() default "";

    /**
     * User name to use for connection authentication.
     *
     * @return The user name to use for connection authentication.
     */
    String user() default "";

    /**
     * Password to use for connection authentication.
     *
     * @return The password to use for connection authentication.
     */
    String password() default "";

    /**
     * Client id to use for connection.
     *
     * @return The client id to use for connection.
     */
    String clientId() default "";

    /**
     * Jakarta Messaging connection factory property. This may be a vendor-specific property or a less commonly used
     * {@code ConnectionFactory} property.
     *
     * <p>
     * Properties are specified using the format: <i>propertyName=propertyValue</i> with one property per array element.
     *
     * @return The Jakarta Messaging connection factory property.
     */
    String[] properties() default {};

    /**
     * Set to {@code false} if connections should not participate in transactions.
     *
     * <p>
     * Default is to enlist in a transaction when one is active or becomes active.
     *
     * @return Whether connections should participate in transactions.
     */
    boolean transactional() default true;

    /**
     * Maximum number of connections that should be concurrently allocated for a connection pool.
     *
     * <p>
     * Default is vendor-specific.
     *
     * @return The maximum number of connections that should be concurrently allocated for a connection pool.
     */
    int maxPoolSize() default -1;

    /**
     * Minimum number of connections that should be concurrently allocated for a connection pool.
     *
     * <p>
     * Default is vendor-specific.
     *
     * @return The minimum number of connections that should be concurrently allocated for a connection pool.
     */
    int minPoolSize() default -1;

}
