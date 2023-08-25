package io.spring.boot.learning.forecast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class ForcastController {
    @GetMapping("/forcast")
    public String forcast(@RequestParam(name = "city", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("city", name);
        return "forcast";
    }
}
