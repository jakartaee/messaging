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
 * A {@code Destination} object encapsulates a provider-specific address. The Jakarta Messaging API does not define a standard address
 * syntax. Although a standard address syntax was considered, it was decided that the differences in address semantics
 * between existing message-oriented middleware (MOM) products were too wide to bridge with a single syntax.
 *
 * <p>
 * Since {@code Destination} is an administered object, it may contain provider-specific configuration information in
 * addition to its address.
 *
 * <p>
 * The Jakarta Messaging API also supports a client's use of provider-specific address names.
 *
 * <p>
 * {@code Destination} objects support concurrent use.
 *
 * <p>
 * A {@code Destination} object is a Jakarta Messaging administered object.
 *
 * <p>
 * Jakarta Messaging administered objects are objects containing configuration information that are created by an administrator and
 * later used by Jakarta Messaging clients. They make it practical to administer the Jakarta Messaging API in the enterprise.
 *
 * <p>
 * Although the interfaces for administered objects do not explicitly depend on the Java Naming and Directory Interface
 * (JNDI) API, the Jakarta Messaging API establishes the convention that Jakarta Messaging clients find administered objects by looking them up in a
 * JNDI namespace.
 *
 * <p>
 * An administrator can place an administered object anywhere in a namespace. The Jakarta Messaging API does not define a naming
 * policy.
 *
 * <p>
 * It is expected that Jakarta Messaging providers will provide the tools an administrator needs to create and configure administered
 * objects in a JNDI namespace. Jakarta Messaging provider implementations of administered objects should implement the
 * {@code javax.naming.Referenceable} and {@code java.io.Serializable} interfaces so that they can be stored in all JNDI
 * naming contexts. In addition, it is recommended that these implementations follow the
 * JavaBeans<SUP>TM</SUP> design patterns.
 *
 * <p>
 * This strategy provides several benefits:
 *
 * <ul>
 * <li>It hides provider-specific details from Jakarta Messaging clients.
 * <li>It abstracts Jakarta Messaging administrative information into objects in the Java programming language ("Java objects") that
 * are easily organized and administered from a common management console.
 * <li>Since there will be JNDI providers for all popular naming services, Jakarta Messaging providers can deliver one implementation
 * of administered objects that will run everywhere.
 * </ul>
 *
 * <p>
 * An administered object should not hold on to any remote resources. Its lookup should not use remote resources other
 * than those used by the JNDI API itself.
 *
 * <p>
 * Clients should think of administered objects as local Java objects. Looking them up should not have any hidden side
 * effects or use surprising amounts of local resources.
 *
 * @see javax.jms.Queue
 * @see javax.jms.Topic
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 1.0
 *
 */
public interface Destination {
}
