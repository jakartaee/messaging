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
 * Specifies that a callback method parameter must be set to the specified message property value. This annotation may
 * be applied to parameters on a callback method on a Jakarta Messaging message-driven bean that has been annotated with the
 * {@code JMSQueueListener} , {@code JMSNonDurableTopicListener} or {@code JMSDurableTopicListener} annotation.
 *
 * <p>
 * The parameter must have a type appropriate to the specified property.
 *
 * <p>
 * The method that will be used by the application server or resource adapter to obtain the property value will depend
 * on the parameter type. The table below defines the method that will be used to obtain the value of a parameter
 * annotated with {@code @MessageProperty("foo")}.
 *
 * <p>
 * If the method parameter is not one of the types listed then deployment must fail.
 *
 * <pre>
 * +-------------------------------------------------------+
 * | Parameter | Set to                                    |
 * | type      |                                           |
 * +-----------+-------------------------------------------+
 * | boolean   | message.getBooleanProperty("foo")         |
 * | Boolean   | (Boolean)message.getObjectProperty("foo") |
 * | byte      | message.getByteProperty("foo")            |
 * | Byte      | (Byte)message.getObjectProperty("foo")    |
 * | short     | message.getShortProperty("foo")           |
 * | Short     | (Short)message.getObjectProperty("foo")   |
 * | int       | message.getIntProperty("foo")             |
 * | Integer   | (Integer)message.getObjectProperty("foo") |
 * | long      | message.getLongProperty("foo")            |
 * | Long      | (Long)message.getObjectProperty("foo")    |
 * | float     | message.getFloatProperty("foo")           |
 * | Float     | (Float)message.getObjectProperty("foo")   |
 * | double    | message.getFloatProperty("foo")           |
 * | Double    | (Double)message.getObjectProperty("foo")  |
 * | String    | message.getStringProperty("foo")          |
 * |-------------------------------------------------------+
 * </pre>
 *
 * <p>
 * Note that only {@code getObjectProperty} and {@code getStringObject} can return a null value. This means that if the
 * specified property is not set then the parameter must be an object type ({@code Boolean}, {@code Byte},
 * {@code Short}, {@code Integer}, {@code Long}, {@code Float}, {@code Double} or {@code String}), in which case the
 * parameter will be set to null. *
 *
 * @see MessageHeader
 *
 * @version JMS 2.1
 * @since JMS 2.1
 */
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface MessageProperty {

    /**
     * Specifies the name of the message property to be used
     *
     * @return The name of the message property to be used
     */
    String value();

}
