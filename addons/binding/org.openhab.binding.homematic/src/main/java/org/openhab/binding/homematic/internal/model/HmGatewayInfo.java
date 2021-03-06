/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.homematic.internal.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Info object which holds gateway specific informations.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public class HmGatewayInfo {
    public static final String ID_HOMEGEAR = "HOMEGEAR";
    public static final String ID_CCU = "CCU";
    public static final String ID_DEFAULT = "DEFAULT";

    private String id;
    private String type;
    private String firmware;
    private String address;
    private boolean wiredInterface;
    private boolean cuxdInterface;
    private boolean hmipInterface;

    /**
     * Returns the id of the gateway type.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the gateway type.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the type of the gateway.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the server.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the firmware version of the gateway.
     */
    public String getFirmware() {
        return firmware;
    }

    /**
     * Sets the firmware version of the gateway.
     */
    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    /**
     * Returns the address of the Homematic gateway.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the Homematic gateway.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns true, if the gateway is a Homegear gateway.
     */
    public boolean isHomegear() {
        return ID_HOMEGEAR.equals(id);
    }

    /**
     * Returns true, if the gateway is a CCU.
     */
    public boolean isCCU() {
        return ID_CCU.equals(id);
    }

    /**
     * Returns true, if the gateway supports the CUxD interface.
     */
    public boolean isCuxdInterface() {
        return cuxdInterface;
    }

    /**
     * Sets the CUxD support of the gateway.
     */
    public void setCuxdInterface(boolean cuxdInterface) {
        this.cuxdInterface = cuxdInterface;
    }

    /**
     * Returns true, if the gateway supports the wired interface.
     */
    public boolean isWiredInterface() {
        return wiredInterface;
    }

    /**
     * Sets the wired support of the gateway.
     */
    public void setWiredInterface(boolean wiredInterface) {
        this.wiredInterface = wiredInterface;
    }

    /**
     * Returns true, if the gateway supports the HMIP interface.
     */
    public boolean isHmipInterface() {
        return hmipInterface;
    }

    /**
     * Sets the HMIP support of the gateway.
     */
    public void setHmipInterface(boolean hmipInterface) {
        this.hmipInterface = hmipInterface;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id).append("type", type)
                .append("firmware", firmware).append("address", address).append("wired", wiredInterface)
                .append("hmip", hmipInterface).append("cuxd", cuxdInterface).toString();
    }
}
