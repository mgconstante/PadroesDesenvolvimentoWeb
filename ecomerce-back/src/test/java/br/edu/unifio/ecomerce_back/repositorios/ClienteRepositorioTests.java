package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce_back.entidades.Cliente;

@SpringBootTest 
public class ClienteRepositorioTests {
    @Autowired 
    private ClienteRepositorio clienteRepositorio;

    @Test 
    public void DeveSalvarUmCliente(){
        Cliente cli = new Cliente();
        cli.setNome("Felipe Becker");
        cli.setEmail("fefebecker@gmail.com");
        cli.setTelefone("14991110000");

        clienteRepositorio.save(cli);
        assertNotNull(cli.getId());
        assertEquals(6, cli.getId());
    }
}
