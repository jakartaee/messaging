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
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation specifies that a callback method on a Jakarta Messaging message-driven bean must receive messages with an
 * acknowledgement type of dups-ok-acknowledge. It may be specified either on the callback method or on the
 * message-driven bean class.
 *
 * <p>
 * The message-driven bean must also be configured to use a transaction management type of BEAN. This may be configured
 * by specifying the annotation {code @TransactionManagement(value=TransactionManagementType.BEAN)} on the
 * message-driven bean. If a transaction management type of BEAN is not configured then it is recommended that
 * deployment will fail.
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
 * If either this annotation or {@code AutoAcknowledge} are specified on both a method of a message-driven bean class
 * and on the message-driven bean class itself then deployment will fail.
 *
 * @see QueueListener
 * @see TopicListener
 * @see DupsOKAcknowledge
 *
 * @version JMS 2.1
 * @since JMS 2.1
 *
 */
@Retention(RUNTIME)
@Target({ METHOD, TYPE })
public @interface DupsOKAcknowledge {

}
