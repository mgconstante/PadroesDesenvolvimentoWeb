package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce_back.entidades.Categoria;
import br.edu.unifio.ecomerce_back.entidades.Produto;
import br.edu.unifio.ecomerce_back.repositorios.CategoriaRepositorio;
import br.edu.unifio.ecomerce_back.repositorios.ProdutoRepositorio;

@SpringBootTest
public class ProdutoRepostorioTests {
    @Autowired // cria um objeto, gerenciado pelo SPRING
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test
    public void deveSalvarUmProdutoNovo(){
        Produto p = new Produto();
        p.setNome("Manga");
        p.setDescricao("Fruta alaranjada, doce");
        p.setPreco(new BigDecimal("12570.30"));
        p.setEstoque(Short.parseShort("10"));

        var c = categoriaRepositorio.findById(Short.parseShort("2")).orElseThrow();
        p.setCategoria(c);

        produtoRepositorio.save(p);

        assertNotNull(p.getId());
        assertEquals(6, p.getId());
    }

}
