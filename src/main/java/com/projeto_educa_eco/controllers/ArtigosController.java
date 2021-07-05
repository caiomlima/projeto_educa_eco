package com.projeto_educa_eco.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtigosController {

    @RequestMapping("/artigos")
    public String artigos() {
        return "/html/artigos_principal";
    }

    @RequestMapping("/artigo1")
    public String artigo1() { return "/html/artigos1"; }

    @RequestMapping("/artigo2")
    public String artigo2() { return "/html/artigos2"; }

    @RequestMapping("/artigo3")
    public String artigo3() { return "/html/artigos3"; }

    @RequestMapping("/artigo4")
    public String artigo4() { return "/html/artigos4"; }

    @RequestMapping("/artigo5")
    public String artigo5() { return "/html/artigos5"; }

    @RequestMapping("/artigo6")
    public String artigo6() { return "/html/artigos6"; }

    @RequestMapping("/artigo7")
    public String artigo7() { return "/html/artigos7"; }

    @RequestMapping("/artigo8")
    public String artigo8() { return "/html/artigos8"; }

    @RequestMapping("/artigo9")
    public String artigo9() { return "/html/artigos9"; }

    @RequestMapping("/artigo10")
    public String artigo10() { return "/html/artigos10"; }

    @RequestMapping("/artigo11")
    public String artigo11() { return "/html/artigos11"; }

    @RequestMapping("/artigo12")
    public String artigo12() { return "/html/artigos12"; }

    @RequestMapping("/artigo13")
    public String artigo13() { return "/html/artigos13"; }

    @RequestMapping("/artigo14")
    public String artigo14() { return "/html/artigos14"; }

}
