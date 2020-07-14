package com.vad.RemoteDirectorySimulator.Model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FetchReq {
    @NotNull(message=" alias value can't be empty")
    private String alias;
    @Size(min=2,max=2,message="aliseType value should be lenght of 2 : 01 – Phone number" + 
            "02 – Email address " + 
            "03 – National ID " + 
            "04 – IBAN (International Bank Account Number) " + 
            "05 – USSD\r")
    private String aliasType;
    
    private String source;
    private String country;
    public FetchReq() {
        super();
        // TODO Auto-generated constructor stub
    }
    public FetchReq(String alias, String aliasType, String source, String country) {
        super();
        this.alias = alias;
        this.aliasType = aliasType;
        this.source = source;
        this.country = country;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getAliasType() {
        return aliasType;
    }
    public void setAliasType(String aliasType) {
        this.aliasType = aliasType;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "FetchReq [alias=" + alias + ", aliasType=" + aliasType + ", source=" + source + ", country=" + country
                + "]";
    }
    
    
    

}
