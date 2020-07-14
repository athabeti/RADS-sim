package com.vad.RemoteDirectorySimulator.Service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vad.RemoteDirectorySimulator.Model.FetchReq;
import com.vad.RemoteDirectorySimulator.Model.FetchResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;
import com.vad.RemoteDirectorySimulator.Repo.FetchRepository;

@Service
public class FetchApiService {

    @Autowired
    private FetchRepository fetchRepo;

    public FetchResponseEntity getAliasDetails(FetchReq inputReq) {

        FetchResponseEntity respObj = null;

        System.out.println(" **** " + inputReq.toString());

        if (inputReq.getAliasType() != null) {
            for (FetchResponseEntity ftresp : fetchRepo.findAll()) {

                if (ftresp.getAlias()
                        .equalsIgnoreCase(aliasPatterMatch(inputReq.getAlias(), inputReq.getAliasType()))) {
                    respObj = ftresp;
                    break;
                } 
            }
        } else {

            for (FetchResponseEntity ftresp : fetchRepo.findAll()) {

                if (ftresp.getAlias().equalsIgnoreCase(inputReq.getAlias())) {
                    respObj = ftresp;
                    break;
                } 
            }

        }
        
        if(respObj==null) {
            try {
                throw new Exception("No Alias information available for the given input - " +inputReq.getAlias() );
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }

        return respObj;

    }

    public String aliasPatterMatch(String aliasInputValue, String aliasType) {

        String mobNoRegex = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}";
        String emailRegex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p1 = null;
        String retVal = "";

        switch (aliasType) {
        case "01":
            if (!p1.matches(mobNoRegex, aliasInputValue)) {

                System.out.println(
                        "p1.matches(mobNoRegex, aliasInputValue) :: " + p1.matches(mobNoRegex, aliasInputValue));
        /*      throw new FetchReqException(
                        " Value of aliasType \"01\" which represent \"-Phone number\"  not matching with input "
                                + aliasInputValue);*/
            } else {
                retVal = aliasInputValue;
            }
            break;
        case "02":
            if (!p1.matches(emailRegex, aliasInputValue)) {
                System.out.println(
                        "p1.matches(emailRegex, aliasInputValue) :: " + p1.matches(emailRegex, aliasInputValue));
                /*throw new FetchReqException(
                        " Value of aliasType \"02\" which represent \"-Email address\"  not matching with input "
                                + aliasInputValue); */
            } else {
                retVal = aliasInputValue;
            }
            break;

        default:
            /*throw new FetchReqException("aliasType other than 01 ,02 are not allowed");*/
        }
        // TODO: handle exception

        return retVal;

    }

}
