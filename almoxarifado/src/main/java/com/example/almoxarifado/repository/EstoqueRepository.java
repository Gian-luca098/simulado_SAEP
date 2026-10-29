package com.example.almoxarifado.repository;

import com.example.almoxarifado.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {
Optional<Estoque> findById(Integer id);

}
