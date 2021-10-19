package com.wd.projeto01.service;

import java.util.List;

import com.wd.projeto01.dto.VendedorNewDTO;
import com.wd.projeto01.entities.Vendedor;
import com.wd.projeto01.repositories.VendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

  @Autowired
  private VendedorRepository repoVendedor;

  public List<Vendedor> findAll() {
    return repoVendedor.findAll();
  }

  public Vendedor findById(Integer id) {
    return repoVendedor.findById(id).orElse(null);
  }

  public Vendedor insert(Vendedor vend) {
    // vend.setId(null);

    return repoVendedor.save(vend);
  }

  public Vendedor fromDTO(VendedorNewDTO vendNew) {
    return new Vendedor(vendNew.getId(), vendNew.getNome());
  }

}
