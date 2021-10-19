package com.wd.projeto01.controllers;

import java.util.List;
import java.util.stream.Collectors;

import com.wd.projeto01.dto.VendasDto;
import com.wd.projeto01.service.VendasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendas")
public class VendasController {

  @Autowired
  private VendasService vendasService;

  @GetMapping
  public ResponseEntity<List<VendasDto>> buscarTodasVendas() {
    List<VendasDto> vendas = vendasService.findAll().stream()
        .map(x -> new VendasDto(x.getId(), x.getVisitas(), x.getValor())).collect(Collectors.toList());

    return ResponseEntity.ok(vendas);
  }

}
