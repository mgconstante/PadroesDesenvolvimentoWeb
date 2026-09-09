package br.edu.unifio.ecomerce_back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce_back.entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria,Short>{
    

}
