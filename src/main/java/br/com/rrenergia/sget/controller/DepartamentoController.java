package br.com.rrenergia.sget.controller;

import br.com.rrenergia.sget.model.Departamento;
import br.com.rrenergia.sget.repository.GerenteRepository;
import br.com.rrenergia.sget.service.DepartamentoService;
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
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/novo")
    public ModelAndView novo(Departamento departamento){
        ModelAndView mv = new ModelAndView("departamento/Cadastro");
        mv.addObject("gerentes", gerenteRepository.findAll());
        return mv;
    }

    @PostMapping("/novo")
    public ModelAndView salvar(@Valid Departamento departamento, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        departamentoService.salvar(departamento);
        redirectAttributes.addFlashAttribute("mensagem" , "Departamento salvo com sucesso.");
        return new ModelAndView("redirect:/departamentos/novo");
    }
}
