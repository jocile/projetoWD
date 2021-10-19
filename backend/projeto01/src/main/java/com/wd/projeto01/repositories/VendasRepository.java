package com.wd.projeto01.repositories;

import com.wd.projeto01.entities.Vendas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<Vendas, Integer> {

}
