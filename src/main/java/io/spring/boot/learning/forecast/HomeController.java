package io.spring.boot.learning.forecast;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {
    @GetMapping(value = "/",produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String home() {
//        return "Home page of the best forecast application ever.";
        return """
                <html>
                <header><title>Welcome</title></header>
                <body>
                Home page of the best forecast application ever.
                </body>
                </html>""";
    }
}
