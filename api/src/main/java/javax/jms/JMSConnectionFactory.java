/*
 * Copyright (c) 2011, 2017 Oracle and/or its affiliates. All rights reserved.
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

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation may be used on a field to specify the JNDI lookup name of a {@code javax.jms.ConnectionFactory} to be
 * used when injecting a {@code javax.jms.JMSContext} object.
 *
 * <p>
 * It may also be used to specify that a callback method on a Jakarta Messaging message-driven bean must use the specified message
 * selector. In this case it may be specified either on the callback method or on the message-driven bean class.
 *
 * <p>
 * If this annotation is specified on a method of a message-driven bean class then that method must also be annotated
 * with {@code QueueListener} or {@code TopicListener}. If it is not then deployment will fail.
 *
 * <p>
 * If this annotation is specified on the message-driven bean class then at least one method must be annotated with
 * {@code QueueListener} or {@code TopicListener}. If no method is annotated with {@code QueueListener} or
 * {@code TopicListener} then deployment will fail.
 *
 * <p>
 * If this annotation is specified on both a method of a message-driven bean class and on the message-driven bean class
 * itself then deployment will fail.
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 2.0
 */
@Retention(RUNTIME)
@Target({ METHOD, FIELD, PARAMETER, TYPE })
public @interface JMSConnectionFactory {

    /**
     * Specifies the JNDI lookup name of a {@code javax.jms.ConnectionFactory} to be used.
     *
     * @return the JNDI lookup name of a {@code javax.jms.ConnectionFactory} to be used
     */
    String value();
}
