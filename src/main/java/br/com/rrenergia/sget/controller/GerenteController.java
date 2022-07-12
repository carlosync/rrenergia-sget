package br.com.rrenergia.sget.controller;

import br.com.rrenergia.sget.model.Gerente;
import br.com.rrenergia.sget.model.TipoGerente;
import br.com.rrenergia.sget.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/gerentes")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @GetMapping("/novo")
    public ModelAndView novo(Gerente gerente){
        ModelAndView mv = new ModelAndView("gerente/Cadastro");
        mv.addObject("tipos", TipoGerente.values());
        return mv;
    }
    @PostMapping("/novo")
    public ModelAndView salvar(@Valid Gerente gerente, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return novo(gerente);
        }
        gerenteService.salvar(gerente);
        redirectAttributes.addFlashAttribute("mensagem", "Gerente salvo com sucesso.");
        return new ModelAndView("redirect:/gerentes/novo");
    }
}
