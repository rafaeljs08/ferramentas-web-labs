package br.fepi.si.parcelamentos.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank
    @Size(max = 60)
    private String nome;

    @NotBlank
    @Email
    @Size(min = 10, max = 255)
    private String email;

    @Column(name = "fone")
    @NotBlank
    @Size(max = 20)
    private String telefone;

}
