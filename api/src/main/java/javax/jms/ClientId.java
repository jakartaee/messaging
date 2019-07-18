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
 * This annotation specifies that a callback method on a Jakarta Messaging message-driven bean must use the specified client
 * identifier.
 * <p>
 * The method must also be annotated with either {@code TopicListener} or {@code QueueListener}. If it is not then
 * deployment will fail.
 * <p>
 *
 * @see TopicListener
 * @see QueueListener
 *
 * @version JMS 2.1
 * @since JMS 2.1
 *
 */
@Retention(RUNTIME)
@Target({ METHOD })
public @interface ClientId {

    /**
     * The client identifier that will be used.
     *
     * @return The client identifier that will be used.
     */
    String value();

}
