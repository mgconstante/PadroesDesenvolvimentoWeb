package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce_back.entidades.Categoria;

@SpringBootTest 
public class CategoriaRepositorioTests {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Test
    public void deveSalvarUmaCategoria(){
        Categoria c = new Categoria();
        c.setNome("Cabelo");
        c.setDescricao("Produtos capilares");

        categoriaRepositorio.save(c);
        assertNotNull(c);
        assertEquals(Short.parseShort("6"), c.getId());
        
    }
}
