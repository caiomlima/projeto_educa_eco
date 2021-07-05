package com.projeto_educa_eco.controllers;

import com.projeto_educa_eco.models.Usuario;
import com.projeto_educa_eco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CadastroController {
	
	@Autowired
	private UsuarioRepository ur;
	
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String form() {
		return "/html/cadastroo";
	}	
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String form(Usuario usr) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(usr.getSenha());
		usr.setSenha(encodedPassword);

		ur.save(usr);

		return "redirect:/";
	}
}
