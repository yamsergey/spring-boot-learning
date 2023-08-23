package io.spring.boot.learning.forecast;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {
    @GetMapping("/")
    public String home() {
//        return "Home page of the best forecast application ever.";
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body>\n" + "Home page of the best forecast application ever.\n" + "</body>\n" + "</html>";
    }
}
