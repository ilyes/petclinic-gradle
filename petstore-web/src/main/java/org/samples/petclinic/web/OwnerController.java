package org.samples.petclinic.web;

import org.samples.petclinic.domain.Owner;
import org.samples.petclinic.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by neil.howerton on 10/6/2014.
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
