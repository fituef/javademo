package com.Labdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private String path ="/WEB-INF/views";
    public HomeController() {

    } 

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index(Model model) {
        model.addAttribute("pageTitle", "Section 1 Page 2");
        model.addAttribute("pageContent", path+"/users/home.jsp");
        System.out.println("Loading pageContent = " + "users/home.jsp");
        return "shared/layout"; // luôn trả về layout.jsp
    }

}
