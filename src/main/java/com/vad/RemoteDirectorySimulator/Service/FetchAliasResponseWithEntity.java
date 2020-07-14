package com.vad.RemoteDirectorySimulator.Service;

import com.vad.RemoteDirectorySimulator.Exception.FetchAiasResponseException;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasLocation;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasPaymentInstrument;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasRecipient;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;

public class FetchAliasResponseWithEntity {

    //FetchApiRequestValidator fetchReqVal;
    FetchResponse fetchResponse;

    public FetchAliasResponse mapResponseObject(FetchResponseEntity responseEntity) throws FetchAiasResponseException {
        // System.out.println(" responseEntity ******* "+responseEntity.toString());

        FetchAliasResponse fetchAliasResponse;
        try {
            FetchAliasPaymentInstrument paymntInst = new FetchAliasPaymentInstrument(responseEntity.getValue(),
                    responseEntity.getValueType(), responseEntity.getTimeSelectedAsPreferred());

            // System.out.println(" paymntInst ******* "+paymntInst.toString());

            FetchAliasLocation location = new FetchAliasLocation(responseEntity.getCity(), responseEntity.getRegion(),
                    responseEntity.getCountry(), responseEntity.getPostalCode());

            // System.out.println(" location ********** " +location.toString());

            FetchAliasRecipient recipient = new FetchAliasRecipient(responseEntity.getFirstName(),
                    responseEntity.getLastName(), responseEntity.getFirstNameLocal(), responseEntity.getLastNameLocal(),
                    responseEntity.getContactEmail(), location);

            // System.out.println("recipient ************ "+recipient.toString());

            fetchAliasResponse = new FetchAliasResponse(paymntInst, recipient);

            // System.out.println(fetchAliasResponse.toString());

        } catch (Exception e) {

            throw new FetchAiasResponseException(" Issue is construing response body :: ");

        }

        return fetchAliasResponse;
    }

}
