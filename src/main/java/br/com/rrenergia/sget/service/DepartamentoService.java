package br.com.rrenergia.sget.service;

import br.com.rrenergia.sget.model.Departamento;
import br.com.rrenergia.sget.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Transactional
    public void salvar(Departamento departamento){
        departamentoRepository.save(departamento);
    }
}
