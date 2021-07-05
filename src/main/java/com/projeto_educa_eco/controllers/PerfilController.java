package com.projeto_educa_eco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerfilController {

    @RequestMapping("/meu-perfil")
    public String meuperfil() {
        return "/html/perfil";
    }

}
