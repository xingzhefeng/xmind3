/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.comm;

import java.util.Properties;

/**
 * 
 * @author Frank Shaka &lt;frank@xmind.net&gt;
 * 
 */
public interface IXMindCommand {

    /**
     * Gets the command name. May be emtpy string. Never be <code>null</code>.
     * <p>
     * For example, if the command was requested from a URI, the command name is
     * the path portion of the URI, with heading/trailing slashes trimmed.
     * </p>
     * 
     * @return the name of the command
     */
    String getCommandName();

    /**
     * Gets all arguments of this command.
     * <p>
     * For example, if the command was requested from a URI, the arguments are
     * decoded and parsed from the query portion of the URI by
     * 'x-www-form-urlencoded' encoding. If there're duplicated keys, only the
     * last value will be kept.
     * </p>
     * 
     * @return all arguments of this command as key-value pairs
     */
    Properties getArguments();

    /**
     * Gets an argument value by a specified key.
     * 
     * @param key
     *            the key of the value
     * @return the value related to the specified key
     */
    String getArgument(String key);

    /**
     * Gets the name of the authority who issued this request.
     * <p>
     * For example, if the command was requested from a URI, the source name is
     * the host name portion of the URI.
     * </p>
     * 
     * @return the source name of this command
     */
    String getSource();

    /**
     * Gets the target of this command.
     * <p>
     * For example, if the command was requested from a URI, the target name is
     * the fragment portion of the URI.
     * </p>
     * 
     * @return the target of this command
     */
    String getTarget();

}
