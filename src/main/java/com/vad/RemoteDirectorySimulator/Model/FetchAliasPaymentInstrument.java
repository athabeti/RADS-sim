package com.vad.RemoteDirectorySimulator.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FetchAliasPaymentInstrument {

    private String value;
    private String type;
    private String whenSelectedAsPreferred;
    
    public FetchAliasPaymentInstrument() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public FetchAliasPaymentInstrument(String value, String type, String whenSelectedAsPreferred) {
        this.value = value;
        this.type = type;
        this.whenSelectedAsPreferred = whenSelectedAsPreferred;
    }
    
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getWhenSelectedAsPreferred() {
        return whenSelectedAsPreferred;
    }
    public void setWhenSelectedAsPreferred(String whenSelectedAsPreferred) {
        this.whenSelectedAsPreferred = whenSelectedAsPreferred;
    }

    @Override
    public String toString() {
        return "FetchAliasPaymentInstrument [value=" + value + ", type=" + type + ", whenSelectedAsPreferred="
                + whenSelectedAsPreferred + "]";
    }
    
    
    
}
