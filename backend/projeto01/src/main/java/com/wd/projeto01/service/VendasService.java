package com.wd.projeto01.service;

import java.util.List;

import com.wd.projeto01.entities.Vendas;
import com.wd.projeto01.repositories.VendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendasService {

  @Autowired
  private VendasRepository vendasRepository;

  public List<Vendas> findAll() {
    return vendasRepository.findAll();
  }

}
