package br.edu.unifio.ecomerce_back.recursos;

import java.util.List;
import br.edu.unifio.ecomerce_back.entidades.Pedido;
import br.edu.unifio.ecomerce_back.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifio.ecomerce_back.repositorios.ProdutoRepositorio;

@RestController 
@RequestMapping("produtos")
public class ProdutoRecurso {
    @Autowired 
    ProdutoRepositorio produtoRepositorio;

    @GetMapping 
    public List<Produto> listar(){
        return produtoRepositorio.findAll(Sort.by("nome"));

        

    }
}
