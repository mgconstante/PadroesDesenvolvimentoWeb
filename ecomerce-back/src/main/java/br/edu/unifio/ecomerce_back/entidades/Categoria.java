package br.edu.unifio.ecomerce_back.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

// @Getter // Gera os Getter
//  @Setter // Gera os Setter
// @NoArgsConstructor // Bloqueia os construtores padrao
// @AllArgsConstructor // Cria os construtores completos

// @Data // Cria os getter, setter e constructors, equals, hashcode e toString
@Entity // especifica que essa classe java é uma entidade (Classe que representa tabela)
@Getter
@Setter
public class Categoria {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Short id;
private String nome;
private String descricao;


}
