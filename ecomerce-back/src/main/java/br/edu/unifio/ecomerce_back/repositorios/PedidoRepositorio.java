package br.edu.unifio.ecomerce_back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce_back.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido,Integer>{

}
