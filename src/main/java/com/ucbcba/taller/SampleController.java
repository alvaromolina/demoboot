package com.ucbcba.taller;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "products";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello2() {
        return "<h1>Hola mundo!</h1>";
    }
}
