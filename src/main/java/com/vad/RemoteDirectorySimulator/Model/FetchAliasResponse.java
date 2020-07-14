package com.vad.RemoteDirectorySimulator.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FetchAliasResponse {

    
    private FetchAliasPaymentInstrument paymentInstrument;
    private FetchAliasRecipient recipient;
    
    public FetchAliasResponse() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public FetchAliasResponse(FetchAliasPaymentInstrument paymentInstrument, FetchAliasRecipient recipient) {
        this.paymentInstrument = paymentInstrument;
        this.recipient = recipient;
    }
    public FetchAliasPaymentInstrument getPaymentInstrument() {
        return paymentInstrument;
    }
    public void setPaymentInstrument(FetchAliasPaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }
    public FetchAliasRecipient getRecipient() {
        return recipient;
    }
    public void setRecipient(FetchAliasRecipient recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "FetchAliasResponse [paymentInstrument=" + paymentInstrument + ", recipient=" + recipient + "]";
    }
    
    
}
