package br.com.rrenergia.sget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstagiarioController {


    @GetMapping("/estagiarios/cadastro")
    public String cadastro(){
        return "estagiario/Cadastro";
    }
}
