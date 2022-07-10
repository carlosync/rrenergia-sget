package br.com.rrenergia.sget.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "gerente")
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Long codigo;

    @Column(name = "nome", length = 150)
    private String nome;

    @OneToMany(mappedBy = "gerente", orphanRemoval = true)
    private List<Departamento> departamentos = new ArrayList<>();

    @NotNull(message = "Tipo de gerente é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_gerente", length = 50)
    private TipoGerente tipoGerente;


}