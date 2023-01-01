package in.bushansirgur.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping({"/users","/user-list"})
    public ModelAndView users(){
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("s","Hello World!");
        return mav;
    }
}
