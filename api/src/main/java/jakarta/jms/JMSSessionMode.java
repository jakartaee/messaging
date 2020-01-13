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

package jakarta.jms;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static jakarta.jms.JMSContext.AUTO_ACKNOWLEDGE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation may be used to specify the session mode to be used when injecting a {@code jakarta.jms.JMSContext}
 * object. The meaning and possible values of session mode are the same as for the {@code ConnectionFactory} method
 * {@code createContext(int sessionMode)}.
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 2.0
 *
 * @see jakarta.jms.JMSContext#createContext(int)
 */
@Retention(RUNTIME)
@Target({ METHOD, FIELD, PARAMETER, TYPE })
public @interface JMSSessionMode {

    /**
     * Specifies the session mode used when injecting a {@code jakarta.jms.JMSContext} object.
     *
     * @return The session mode used when injecting a {@code jakarta.jms.JMSContext} object.
     */
    int value() default AUTO_ACKNOWLEDGE;
}
