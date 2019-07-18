/*
 * Copyright (c) 2015, 2017 Oracle and/or its affiliates. All rights reserved.
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

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation designates a callback method on a Jakarta Messaging message-driven bean that will receive messages from a topic,
 * and specifies the topic from which messages will be received.
 *
 * <p>
 * By default a non-durable subscription is used. The {@code DurableSubscription} annotation may be used in conjunction
 * with this annotation to specify that a durable subscription is required.
 *
 * <p>
 * This annotation may only be used if the Jakarta Messaging message-driven bean implements the {@code JMSMessageDrivenBean} marker
 * interface and does not implement the {@code MessageListener} interface. If this annotation is used on a
 * message-driven bean that implements the {@code MessageListener} interface then deployment will fail.
 *
 * <p>
 * Only one method may be designated as a callback method. If more than one method on a Jakarta Messaging message-driven bean is
 * annotated with {@code QueueListener} or {@code TopicListener} then deployment will fail.
 *
 * @see JMSMessageDrivenBean
 * @see QueueListener
 * @see DurableSubscription
 *
 * @version JMS 2.1
 * @since JMS 2.1
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface TopicListener {

    /**
     * Lookup name of the Topic from which messages will be received.
     *
     * @return The lookup name of the Topic.
     */
    String value() default "";

}
