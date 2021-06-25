package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
  public String showCars(@RequestParam("num") String num, ModelMap modelMap,int numb){

        return num;
    }
}
