package com.fiap.jdd01.exercicio4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Condomino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    private String nome;

    @NotBlank
    @NotNull
    private String dddCelular;

    @NotBlank
    @NotNull
    private String numeroCelular;

    @NotBlank
    @NotNull
    private String email;

    @NotBlank
    @NotNull
    private String bloco;

    @NotBlank
    @NotNull
    private String apto;

    @NotBlank
    @NotNull
    private String cpf;

}
