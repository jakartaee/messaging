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

/**
 * This is a marker interface that may be implemented by a message-driven bean class to specify that it is used to
 * consume JMS messages. It is an alternative to implementing the MessageListener interface.
 *
 * <p>
 * A JMS message-driven bean that implements the {@code JMSMessageDrivenBean} marker interface must not also implement
 * the {@code MessageListener} interface.
 *
 * <p>
 * If the MDB implements this interface then each callback method must be annotated with one of
 * {@code JMSQueueListener}, {@code JMSNonDurableTopicListener} or {@code JMSDurableTopicListener}.
 *
 * @see JMSMessageDrivenBean
 * @see TopicListener
 * @see DurableSubscription
 * @see QueueListener
 *
 * @version JMS 2.1
 * @since JMS 2.1
 *
 */
public interface JMSMessageDrivenBean {

}
