package com.projeto_educa_eco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("")
	public String indexStandart() {
		return "index";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
//	@RequestMapping(value="/cadastro")
//	public String a() {
//		return "cadastroo";
//	}
}
