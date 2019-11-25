package rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    
    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot";
    }
}
