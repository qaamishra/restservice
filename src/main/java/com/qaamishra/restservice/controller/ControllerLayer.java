package com.qaamishra.restservice.controller;

import com.qaamishra.restservice.dto.FaceCream;
import com.qaamishra.restservice.dto.ToothPaste;
import com.qaamishra.restservice.service.ServiceLayer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ControllerLayer {

    ServiceLayer serviceLayer=new ServiceLayer();

    @RequestMapping(value = "/toothpaste",method = RequestMethod.GET, produces = "application/json")
    public ToothPaste getToothPasteInfo(){

        return serviceLayer.getToothPasteInfo();
    }

    @RequestMapping(value = "/facecream",method = RequestMethod.GET, produces = "application/json")
    public FaceCream getFaceCreamInfo(){

        return serviceLayer.getFaceCreamInfo();
    }
}
