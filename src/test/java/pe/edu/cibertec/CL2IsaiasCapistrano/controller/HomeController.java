package pe.edu.cibertec.CL2IsaiasCapistrano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home(){
        return "home";
    }

}
