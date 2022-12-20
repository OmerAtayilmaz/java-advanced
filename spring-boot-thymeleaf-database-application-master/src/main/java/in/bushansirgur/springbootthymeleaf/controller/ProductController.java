package in.bushansirgur.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping({"/products","/product-list"})
    public ModelAndView productList(){
        ModelAndView mav=new ModelAndView("list-products");
        mav.addObject("message","Hello World!");
        return mav;
    }
}
