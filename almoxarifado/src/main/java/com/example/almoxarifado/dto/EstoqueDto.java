package com.example.almoxarifado.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalTime;

public record EstoqueDto(
        @Min(1)
        @NotBlank (message = "preecha este campo")
         Integer quantidade,
         @NotBlank (message = "preecha este campo")
         String nome,
        @NotBlank (message = "preecha este campo")
         LocalDate dataSaida,
        @NotBlank (message = "preecha este campo")
         LocalTime dataHoraSaida

) {
}
