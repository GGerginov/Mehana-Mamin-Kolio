package com.gerginov.demo.web;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {


    @GetMapping("/")
    public ModelAndView index(){


        return super.view("index");
    }


    @GetMapping("/about")
    public ModelAndView aboutUs(){




        return super.view("about");
    }
}
