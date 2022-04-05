package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute( "data", "hello!!");
        return "hello";
    }
    @GetMapping("realtek")
    public String realtek(Model model){
        model.addAttribute( "realtek", "realtek!!");
        return "realtek";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
    @GetMapping("realtek_id")
    public String realtk_id(@RequestParam("id") String id, String realtek, Model model){
        model.addAttribute("realtek_id",id);
        model.addAttribute("realtek", realtek);
        return "realtek";
    }
}