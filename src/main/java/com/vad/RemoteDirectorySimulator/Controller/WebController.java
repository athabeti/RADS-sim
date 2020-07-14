package com.vad.RemoteDirectorySimulator.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vad.RemoteDirectorySimulator.Model.FetchResponse;
import com.vad.RemoteDirectorySimulator.Model.FetchResponseEntity;
import com.vad.RemoteDirectorySimulator.Service.FetchV2ApiServices;

@Controller
public class WebController {

    @Autowired
    private FetchV2ApiServices fetchv2AliasService;

    @RequestMapping(value = "/aliasCreation", method = RequestMethod.POST)
    public String index(@ModelAttribute("inputData") FetchResponseEntity fetchResp) {

        System.out.println(" print ui data :: " + fetchResp.toString());
        fetchv2AliasService.saveAliasData(fetchResp);
        return "aliasSuccess";
    }

    @RequestMapping(value = "/aliasCreation", method = RequestMethod.GET)
    public String aliasForm(Model model) {
        FetchResponseEntity fr = new FetchResponseEntity();
        model.addAttribute("inputData", fr);
        return "CreateAlias";
    }
}
