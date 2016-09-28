package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Blake on 9/26/16.
 */

@Controller
public class ComponentizingWireframesController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {

        return "index";
    }
}
