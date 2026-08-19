package br.edu.unifio.ecomerce_back.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Getter // Gera os Getter
//  @Setter // Gera os Setter
// @NoArgsConstructor // Bloqueia os construtores padrao
// @AllArgsConstructor // Cria os construtores completos

@Data // Cria os getter, setter e constructors, equals, hashcode e toString
public class Categoria {
private Short id;
private String nome;
private String descricao;


}
