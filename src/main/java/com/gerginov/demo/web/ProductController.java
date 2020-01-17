package com.gerginov.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController extends BaseController {

    @GetMapping("/menu")
    public ModelAndView getMenu(){


        return super.view("menu");
    }

    @GetMapping("/cart")
    public ModelAndView getCart(){


        return super.view("cart");
    }
}
