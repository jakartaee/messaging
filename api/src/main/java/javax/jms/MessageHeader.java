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

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Specifies that a callback method parameter must be set to the specified message header value. This annotation may be
 * applied to parameters on a callback method on a Jakarta Messaging message-driven bean that has been annotated with the
 * {@code JMSQueueListener} , {@code JMSNonDurableTopicListener} or {@code JMSDurableTopicListener} annotation.
 *
 * <p>
 * The parameter type must match the header type as shown in the following table. If it does not then deployment will
 * fail.
 *
 * <pre>
 * +-------------------+------------------------------------------------+
 * | Annotation                                     | Parameter         |
 * |                                                | type              |
 * +-------------------+------------------------------------------------+
 * | @MessageHeader(Header.JMSCorrelationID)        | String            |
 * | @MessageHeader(Header.JMSCorrelationIDAsBytes) | byte[]            |
 * | @MessageHeader(Header.JMSDeliveryMode)         | Integer or int    |
 * | @MessageHeader(Header.JMSDeliveryTime)         | Long or long      |
 * | @MessageHeader(Header.JMSDestination)          | Destination       |
 * | @MessageHeader(Header.JMSExpiration)           | Long or long      |
 * | @MessageHeader(Header.JMSMessageID)            | String            |
 * | @MessageHeader(Header.JMSPriority)             | Integer or int    |
 * | @MessageHeader(Header.JMSRedelivered)          | Boolean or boolean|
 * | @MessageHeader(Header.JMSReplyTo)              | Destination       |
 * | @MessageHeader(Header.JMSTimestamp)            | Long or long      |
 * | @MessageHeader(Header.JMSType)                 | String            |
 * +-------------------+------------------------------------------------+
 * </pre>
 *
 * @version JMS 2.1
 * @since JMS 2.1
 *
 * @see MessageProperty
 *
 */
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface MessageHeader {

    /**
     * Specifies the header field to be used
     *
     * @return The header field to be used
     */
    Header value();

    public enum Header {
        JMSCorrelationID, JMSCorrelationIDAsBytes, JMSDeliveryMode, JMSDeliveryTime, JMSDestination, JMSExpiration, JMSMessageID, JMSPriority, JMSRedelivered,
        JMSReplyTo, JMSTimestamp, JMSType
    }

}
