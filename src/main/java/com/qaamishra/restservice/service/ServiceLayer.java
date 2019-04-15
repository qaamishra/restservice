package com.qaamishra.restservice.service;

import com.qaamishra.restservice.dto.FaceCream;
import com.qaamishra.restservice.dto.ToothPaste;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

    public ToothPaste getToothPasteInfo() {

        ToothPaste toothPaste = new ToothPaste();
        toothPaste.setName("Dabur");
        toothPaste.setFlavour("mint");
        toothPaste.setPrice("Rs25");
        toothPaste.setQuantity("250grams");
        toothPaste.setAvailability("Available");

        return toothPaste;
    }

    public FaceCream getFaceCreamInfo() {

        FaceCream faceCream = new FaceCream();
        faceCream.setName("Sun Proctect");
        faceCream.setSpf("15");
        faceCream.setManufacturer("Himalaya");
        faceCream.setPrice("Rs350");

        return faceCream;
    }

}
