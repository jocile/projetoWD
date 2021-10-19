package com.wd.projeto01.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_venda")
public class Vendas {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  Integer id;
  @Getter
  @Setter
  Integer visitas;
  @Getter
  @Setter
  private Integer qtdVendas;
  @Getter
  @Setter
  Double valor;
  @Getter
  @Setter
  private LocalDate data;

  @ManyToOne
  @JoinColumn(name = "vendedor_id")
  private Vendedor vendedor;

}
