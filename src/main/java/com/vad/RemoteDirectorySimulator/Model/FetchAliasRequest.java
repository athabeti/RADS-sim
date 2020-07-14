package com.vad.RemoteDirectorySimulator.Model;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = false)
public class FetchAliasRequest {

    @NotNull(message = " alias is Mandetory fields")
    private String alias;
    /*
     * @Size(min=2,max=2,message="aliseType value should be lenght of 2 : \r\n" +
     * "Values which goes under type are :: \r\n" + " 01 – Phone number \r\n" +
     * "02 – Email address \r\n" + "03 – National ID \r\n" +
     * "04 – IBAN (International Bank Account Number) \r\n" + "05 – USSD\r")
     */

    private String type;

    public FetchAliasRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FetchAliasRequest(String alias, String type) {
        this.alias = alias;
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FetchAliasRequest [alias=" + alias + ", type=" + type + "]";
    }

}
