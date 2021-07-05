package com.projeto_educa_eco.controllers;

import com.projeto_educa_eco.models.Usuario;
import com.projeto_educa_eco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "/html/loginn";
    }

//    @RequestMapping(value = "/login", method=RequestMethod.POST)
//    public String loginS() {
//        return "redirect:/";
//    }


}
