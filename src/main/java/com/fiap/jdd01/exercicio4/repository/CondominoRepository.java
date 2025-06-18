package com.fiap.jdd01.exercicio4.repository;

import com.fiap.jdd01.exercicio4.model.Condomino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CondominoRepository extends JpaRepository<Condomino, Long> {

    Optional<Condomino> findByEmail(String email);

    Optional<Condomino> findByCpf(String cpf);

}
