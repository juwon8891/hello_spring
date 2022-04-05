package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestController {
        @GetMapping("/getParam")
        public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
            return "ID: " + id + ", Password: " + pwd;
        }
}