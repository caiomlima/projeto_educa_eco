package com.projeto_educa_eco.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
public class McvConfig implements WebMvcConfigurer {

    public void addViewController(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/cadastro").setViewName("cadastro");
        registry.addViewController("/artigos").setViewName("artigos");
        registry.addViewController("/simulador").setViewName("simulador");
        registry.addViewController("/ongs").setViewName("ongs");
        registry.addViewController("/ecopontos").setViewName("ecopontos");
        registry.addViewController("/desafios").setViewName("desafios");
        registry.addViewController("/meu-perfil").setViewName("meu-perfil");
    }

}
