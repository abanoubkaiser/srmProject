package demo.srmsystem.srm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/srm", "/srm/home"})
    public String displayHomePage() {
        return "home/index";
    }

}
