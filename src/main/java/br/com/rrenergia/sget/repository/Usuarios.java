package br.com.rrenergia.sget.repository;

import br.com.rrenergia.sget.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuarios extends JpaRepository<Usuario, Long> {

}