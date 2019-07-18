/*
 * Copyright (c) 1997, 2017 Oracle and/or its affiliates. All rights reserved.
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
 * A {@code Topic} object encapsulates a provider-specific topic name.
 *
 * <p>
 * It is the way a client specifies the identity of a topic to Jakarta Messaging API methods. For those methods that use a
 * {@code Destination} as a parameter, a {@code Topic} object may used as an argument . For example, a Topic can be used
 * to create a {@code MessageConsumer} and a {@code MessageProducer} by calling:
 *
 * <ul>
 * <li>{@code Session.CreateConsumer(Destination destination)}
 * <li>{@code Session.CreateProducer(Destination destination)}
 * </ul>
 *
 * <p>
 * Many publish/subscribe (pub/sub) providers group topics into hierarchies and provide various options for subscribing
 * to parts of the hierarchy. The Jakarta Messaging API places no restriction on what a {@code Topic} object represents. It may be a
 * leaf in a topic hierarchy, or it may be a larger part of the hierarchy.
 *
 * <p>
 * The organization of topics and the granularity of subscriptions to them is an important part of a pub/sub
 * application's architecture. The Jakarta Messaging API does not specify a policy for how this should be done. If an application
 * takes advantage of a provider-specific topic-grouping mechanism, it should document this. If the application is
 * installed using a different provider, it is the job of the administrator to construct an equivalent topic
 * architecture and create equivalent {@code Topic} objects.
 *
 * @see Session#createConsumer(Destination)
 * @see Session#createProducer(Destination)
 * @see javax.jms.TopicSession#createTopic(String)
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 1.0
 */
public interface Topic extends Destination {

    /**
     * Gets the name of this topic.
     *
     * <p>
     * Clients that depend upon the name are not portable.
     *
     * @return the topic name
     *
     * @exception JMSException if the Jakarta Messaging provider implementation of {@code Topic} fails to return the topic name due to
     * some internal error.
     */
    String getTopicName() throws JMSException;

    /**
     * Returns a string representation of this object.
     *
     * @return the provider-specific identity values for this topic
     */
    @Override
    String toString();
}
