package com.fiap.jdd01.exercicio4.controller;

import com.fiap.jdd01.exercicio4.model.Condomino;
import com.fiap.jdd01.exercicio4.repository.CondominoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condomino")
public class CondominoController {

    @Autowired
    private CondominoRepository repository;

    @PostMapping
    public ResponseEntity<Object> cadastrar(@RequestBody @Valid Condomino novoCondomino) {
        novoCondomino.setId(null);

        if (repository.findByEmail(novoCondomino.getEmail()).isPresent()) {
            return ResponseEntity.unprocessableEntity().body("E-mail já cadastrado");
        }

        if (repository.findByCpf(novoCondomino.getCpf()).isPresent()) {
            return ResponseEntity.unprocessableEntity().body("CPF já cadastrado");
        }

        Condomino condominoSalvo =repository.save(novoCondomino);

        return ResponseEntity.created(null).body(condominoSalvo);
    }

}
