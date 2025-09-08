package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(name = "count", required = false, defaultValue = "0") int count,
                           Model model) {
        model.addAttribute("cars", carServiceImpl.getCars(count));
        return "cars";
    }
}
