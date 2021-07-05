package com.projeto_educa_eco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EcoPontosController {

    @RequestMapping("/ecopontos")
    public String ecopontos() {
        return "/html/ecopontos";
    }

}
