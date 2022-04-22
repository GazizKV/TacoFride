package tacos.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author valit
 * date     22.04.2022
 * @project taco-cloud
 */

@Controller
public class HomeController {


    @GetMapping
    public String home() {
        return "home";
    }
}
