package io.spring.boot.learning.forecast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
class HomeController {
    @GetMapping(value = "/")
    public String home() {
     return "home";
    }
}
