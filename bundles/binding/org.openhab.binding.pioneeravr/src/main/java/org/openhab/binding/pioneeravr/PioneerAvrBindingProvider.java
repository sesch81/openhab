/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pioneeravr;

import java.util.HashMap;

import org.openhab.core.binding.BindingProvider;
import org.openhab.core.items.Item;

/**
 * This interface is implemented by classes that can provide mapping information
 * between openHAB items and Pioneer AV devices.
 *
 * @author Rainer Ostendorf
 * @author based on the Onkyo binding by Pauli Anttila and others
 * @since 1.4.0
 */
public interface PioneerAvrBindingProvider extends BindingProvider {

    /**
     * Returns the Type of the Item identified by {@code itemName}
     * 
     * @param itemName the name of the item to find the type for
     * @return the type of the Item identified by {@code itemName}
     */
    Class<? extends Item> getItemType(String itemName);

    /**
     * Returns the command to the given <code>itemName</code>.
     * 
     * @param itemName
     *            the item for which to find a command.
     * @param command
     *            the openHAB command for which to find a device command
     * 
     * @return the corresponding command or <code>null</code> if no matching
     *         device id could be found.
     */
    public String getDeviceCommand(String itemName, String command);

    /**
     * Returns the init command to the given <code>itemName</code>.
     * 
     * @param itemName
     *            the item for which to find a command.
     * 
     * @return the corresponding init command or <code>null</code> if no init
     *         command is defined.
     */
    public String getItemInitCommand(String itemName);

    /**
     * Returns all commands to the given <code>itemName</code>.
     * 
     * @param itemName
     *            the item for which to find a command.
     * 
     * @return the corresponding list of commands or <code>null</code> if no commands
     *         could be found.
     */
    public HashMap<String, String> getDeviceCommands(String itemName);
}
