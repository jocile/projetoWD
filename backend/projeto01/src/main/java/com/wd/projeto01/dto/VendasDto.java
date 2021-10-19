package com.wd.projeto01.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendasDto {
  @Id
  @GeneratedValue
  private Integer id;
  private Integer visitas;
  private Double valor;

}
