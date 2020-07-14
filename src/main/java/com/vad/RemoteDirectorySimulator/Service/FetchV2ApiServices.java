package com.vad.RemoteDirectorySimulator.Service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vad.RemoteDirectorySimulator.Exception.FetApiRequestBodyException;
import com.vad.RemoteDirectorySimulator.Exception.FetchAiasResponseException;
import com.vad.RemoteDirectorySimulator.Exception.FetchAliasNoDataException;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasLocation;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasPaymentInstrument;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasRecipient;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasRequest;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;
import com.vad.RemoteDirectorySimulator.Repo.FetchRepository;
import com.vad.RemoteDirectorySimulator.util.CheckAliasType;

@Service
public class FetchV2ApiServices {

    @Autowired
    private FetchRepository fetchRepo;

    FetchAliasResponseWithEntity fetchAlisRespEntyMap = new FetchAliasResponseWithEntity();
    private boolean isRecordExist = false;
    FetchAliasResponse response = new FetchAliasResponse();
    CheckAliasType checkAlias = new CheckAliasType();

    public FetchAliasResponse getV2AliasData(FetchAliasRequest inputReq) throws FetApiRequestBodyException {

        System.out.println(" input request :: " + inputReq.toString());

        System.out.println("PAYLOAD Validation completed :: ");

        if (inputReq.getAlias() != null && (inputReq.getType() == null)) {
            System.out.println(" ******************** In condition where alise is only in the request ");

            response = getDetailsWithAliasOnly(inputReq);

        } else if ((inputReq.getAlias() != null) && (inputReq.getType() != null)) {

            System.out.println(" ******************** In condition where alise and type are in request  ");
            /*
             * fetchReqVal.validateAliasType(); fetchReqVal.validateCustomType();
             */

            if (checkAlias.isAliasTypeExist(inputReq.getType())) {
                System.out.println(inputReq.getType()+ " ::  given type is in the list :: true " );
                response = getDetailsWithAliasAndType(inputReq);
            } else {

                System.out.println(inputReq.getType()+ " :: given type is in the list :: false ");
                response = getDetailsWithAliasOnly(inputReq);
            }

        } else {

            System.out.println(" ******************** :: Wrong Request ");
        }

        return response;
    }

    public FetchAliasResponse getDetailsWithAliasAndType(FetchAliasRequest inputReq)
            throws FetchAliasNoDataException, FetchAiasResponseException {
        FetchAliasResponse faresp = null;
        
        System.out.println("getDetailsWithAliasAndType :: ");

        try {

            for (FetchResponseEntity fchRespIterator : fetchRepo.findAll()) {

                if (fchRespIterator.getAlias().equals(inputReq.getAlias())
                        && (fchRespIterator.getAliasType().equalsIgnoreCase(inputReq.getType()))) {
                    faresp = fetchAlisRespEntyMap.mapResponseObject(fchRespIterator);
                    isRecordExist = true;
                    break;

                }
            }
            System.out.println(" is the flag :: " + isRecordExist);

            NoDataHadle(isRecordExist);

        } catch (FetApiRequestBodyException e) {

            throw new FetchAiasResponseException(e.toString());
        }

        return faresp;
    }

    public FetchAliasResponse getDetailsWithAliasOnly(FetchAliasRequest inputReq)
            throws FetchAliasNoDataException, FetchAiasResponseException {
        FetchAliasResponse faresp = null;
        System.out.println("getDetailsWithAliasOnly :: ");
        try {
            for (FetchResponseEntity fchRespIterator : fetchRepo.findAll()) {

                if (fchRespIterator.getAlias().equals(inputReq.getAlias())) {
                    isRecordExist = true;
                    faresp = fetchAlisRespEntyMap.mapResponseObject(fchRespIterator);
                    break;
                }

            }
            System.out.println(" is the flag :: " + isRecordExist);
            NoDataHadle(isRecordExist);
        } catch (FetApiRequestBodyException e) {
            throw new FetchAiasResponseException(e.toString());
        }
        System.out.println(" faresp :: " + faresp.toString());

        return faresp;

    }

    public void NoDataHadle(boolean flag) throws FetchAliasNoDataException {

        if (!isRecordExist) {

            throw new FetchAliasNoDataException(" No Data Matching input ");
        } else {
            isRecordExist = false;
        }
    }

    public void saveAliasData(FetchResponseEntity fchResp) {

        fetchRepo.save(fchResp);

    }
}
