package br.com.rrenergia.sget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerentes")
public class GerenteController {


    @GetMapping("/novo")
    public String cadastro(){
        return "gerente/Cadastro";
    }
}
