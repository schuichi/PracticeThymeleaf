package tomek.pl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.awt.SystemColor.text;

/**
 * Created by Tomek on 2017-01-31.
 */

@Controller
public class HelloController {


    @GetMapping("/")
    public String index (ModelMap modelMap){
        modelMap.addAttribute("text1", "To jest text z indexu");
        return "index";
    }

    @GetMapping("/if")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("text", "to jest text w html");
        modelMap.addAttribute("a", 123);
        modelMap.addAttribute("b", 456);
        return "if";
    }

}
