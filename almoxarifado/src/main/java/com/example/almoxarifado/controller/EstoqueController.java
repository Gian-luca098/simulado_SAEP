package com.example.almoxarifado.controller;


import com.example.almoxarifado.dto.EstoqueDto;
import com.example.almoxarifado.model.Estoque;
import com.example.almoxarifado.repository.EstoqueRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/almoxarifado")
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository;

    @PostMapping
    public ResponseEntity<Estoque> create(@RequestBody @Valid EstoqueDto estoqueDto) {
        var estoque = new Estoque();
        BeanUtils.copyProperties(estoqueDto, estoque);
        return ResponseEntity.ok(estoqueRepository.save(estoque));

    }


    @GetMapping ("{id}")
    public List<Estoque> getEstoqueById(@RequestParam @Valid Integer id) {


    }

    @DeleteMapping("{id}")
    public ResponseEntity<Estoque> delete(@RequestParam @Valid Integer id) {

    }

    @PutMapping("{id}")
    public ResponseEntity<Estoque>


    @GetMapping
    public ResponseEntity<List<Estoque>> getAllEstoques() {
        return ResponseEntity.ok(estoqueRepository.findAll());
    }









}
