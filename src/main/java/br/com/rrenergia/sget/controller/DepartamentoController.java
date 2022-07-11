package br.com.rrenergia.sget.controller;

import br.com.rrenergia.sget.model.Departamento;
import br.com.rrenergia.sget.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private GerenteRepository gerenteRepository;

    @GetMapping("/novo")
    public ModelAndView novo(Departamento departamento){
        ModelAndView mv = new ModelAndView("departamento/Cadastro");
        mv.addObject("gerentes", gerenteRepository.findAll());
        return mv;
    }

    @PostMapping("/novo")
    public ModelAndView cadastrar(@Valid Departamento departamento, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        redirectAttributes.addFlashAttribute("mensagem" , "Departamento salvo com sucesso.");
        System.out.println("Nome: " + departamento.getNome());
        System.out.println("Gerente " + departamento.getGerente());
        return new ModelAndView("redirect:/departamentos/novo");
    }
}
