package org.samples.petclinic.web;

import org.samples.petclinic.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class for domain Pet object
 * Author: neil.howerton
 * Date: 04/22/2015
 */
@Controller
public class OwnerController {
	
    private final IOwnerService ownerService;

    @Autowired
    public OwnerController (IOwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(value = "/owners", method = RequestMethod.GET)
    public String view(Model model) {
        return "owners/view";
    }
}
