package br.com.rrenergia.sget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/terceirizados")
public class TerceirizadosController {

    @GetMapping("/novo")
    public String novo(){
        return "terceirizado/Cadastro";
    }
}
