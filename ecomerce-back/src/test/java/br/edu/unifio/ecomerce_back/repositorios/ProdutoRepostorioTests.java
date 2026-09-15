package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import br.edu.unifio.ecomerce_back.entidades.Produto;

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

    @Test
    public void deveBuscarUmProdutoPorId(){
        Produto produto = produtoRepositorio.findById(2).orElseThrow();
        assertNotNull(produto);
        assertEquals("Banana",produto.getNome());
    }

    @Test
    public void deveBuscarTodosOsProdutos(){
       List<Produto> produtos = produtoRepositorio.findAll(Sort.by("nome"));
       assertEquals(5, produtos.size());
       assertEquals("Banana",produtos.get(0).getNome());
    }

    @Test
    public void deveExcluirUmProdutoPorId(){
        Produto p = new Produto();
        p.setNome("Excluir");
        p.setDescricao("Vai ser removido");
        p.setPreco(new BigDecimal("789456123"));
        p.setEstoque(Short.parseShort("9"));

        var c = categoriaRepositorio.findById(Short.parseShort("2")).orElseThrow();
        p.setCategoria(c);

        produtoRepositorio.save(p);
        assertTrue(produtoRepositorio.existsById(p.getId()));
        produtoRepositorio.deleteById(p.getId());
        assertFalse(produtoRepositorio.existsById(p.getId()));
    }

    @Test
    public void deveAtualizarONomeDeUmProduto(){
        Produto p = new Produto();
        p.setNome("Excluir");
        p.setDescricao("Vai ser removido");
        p.setPreco(new BigDecimal("789456123"));
        p.setEstoque(Short.parseShort("9"));

        var c = categoriaRepositorio.findById(Short.parseShort("2")).orElseThrow();
        p.setCategoria(c);

        produtoRepositorio.save(p);

        p.setNome("Nome Novo");
        produtoRepositorio.save(p);
        assertEquals("Nome Novo", produtoRepositorio.findById(p.getId()).orElseThrow().getNome());
    }

}
