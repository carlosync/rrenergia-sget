package br.com.rrenergia.sget.service;

import br.com.rrenergia.sget.model.Gerente;
import br.com.rrenergia.sget.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GerenteService {

    @Autowired
    private GerenteRepository gerenteRepository;

    @Transactional
    public void salvar(Gerente gerente){
        System.out.println("Chegou aqui..");
        gerenteRepository.save(gerente);
    }
}
