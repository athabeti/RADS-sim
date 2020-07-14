package com.vad.RemoteDirectorySimulator.Model;

import javax.validation.constraints.NotNull;

public class FetchAliasCustomType {

    @NotNull(message = " networkType can't be empty ")
    private String networkType;
    @NotNull(message = " networkName can't be empty ")
    private String networkName;

    public FetchAliasCustomType() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FetchAliasCustomType(String networkType, String networkName) {
        this.networkType = networkType;
        this.networkName = networkName;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

}
