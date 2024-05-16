package com.fred.Hello.World.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notas")
@SequenceGenerator(name = "seq_nota", sequenceName = "seq_nota", allocationSize = 1, initialValue = 1)
public class Notas {


  private  String dados;
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota")
  private Long id;



}
