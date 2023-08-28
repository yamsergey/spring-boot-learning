package io.spring.boot.learning.forecast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class ForecastController {
    @GetMapping("/forecast")
    public String forecast(@RequestParam(name = "city", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("city", name);
        return "forecast";
    }

    @PostMapping("/forecast/coordinates")
    public String forecastForCoordinates(@ModelAttribute Location location, Model model) {
        model.addAttribute("greeting", greeting);
        return "forecast_coordinates";
    }

    @GetMapping("/forecast/coordinates")
    public String forecastForCoordinates() {
        return "forecast_coordinates";
    }
}
