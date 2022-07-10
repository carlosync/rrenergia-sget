package br.com.rrenergia.sget.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Long codigo;

    @NotBlank(message = "Nome é Obrigatório")
    @Column(name = "nome", length = 100)
    private String nome;

    @NotBlank(message = "Sigla é Obrigatório")
    @Column(name = "sigla", length = 10)
    private String sigla;

    @NotNull(message = "Gerente é obrigatório")
    @ManyToOne
    @JoinColumn(name = "codigo_gerente")
    private Gerente gerente;


}