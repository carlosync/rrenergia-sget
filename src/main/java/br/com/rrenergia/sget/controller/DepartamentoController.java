package br.com.rrenergia.sget.controller;

import br.com.rrenergia.sget.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private GerenteRepository gerenteRepository;

    @GetMapping("/novo")
    public ModelAndView cadastro(){
        ModelAndView mv = new ModelAndView("departamento/Cadastro");
        mv.addObject("gerentes", gerenteRepository.findAll());
        return mv;
    }
}
