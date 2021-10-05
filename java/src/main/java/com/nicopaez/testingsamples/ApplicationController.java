package com.nicopaez.testingsamples;

import com.nicopaez.testingsamples.domain.SemaforoDeTemperatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {


    private SemaforoDeTemperatura semaforo;

    public ApplicationController(SemaforoDeTemperatura semaforo) {
        this.semaforo = semaforo;
    }

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    @RequestMapping("/semaforo")
    public @ResponseBody String semaforo(int temperatura) {
        return this.semaforo.getColorPara(temperatura).toString();
    }

}
