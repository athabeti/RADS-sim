package com.vad.RemoteDirectorySimulator.Contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasRequest;
import com.vad.RemoteDirectorySimulator.Model.FetchAliasResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchReq;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;
import com.vad.RemoteDirectorySimulator.Service.FetchApiService;
import com.vad.RemoteDirectorySimulator.Service.FetchV2ApiServices;

@RestController
public class FetchController {

    @Autowired
    private FetchApiService fetchservice;

    @Autowired
    private FetchV2ApiServices fetchv2AliasService;

    @PostMapping("/v1/fetchAlias")
    public FetchResponseEntity getalias(@Valid @RequestBody FetchReq fetchReq) {

        return fetchservice.getAliasDetails(fetchReq);
    }

    @PostMapping("/v2/fetchAlias")
    public FetchAliasResponse getV2alias(@Valid @RequestBody FetchAliasRequest fetchReq) {

        return fetchv2AliasService.getV2AliasData(fetchReq);
    }
    
    
    
}
