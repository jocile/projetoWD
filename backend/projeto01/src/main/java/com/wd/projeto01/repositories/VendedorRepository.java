package com.wd.projeto01.repositories;

import com.wd.projeto01.entities.Vendedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
