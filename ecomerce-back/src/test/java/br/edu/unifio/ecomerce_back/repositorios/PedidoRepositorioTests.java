package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce_back.entidades.Cliente;
import br.edu.unifio.ecomerce_back.entidades.Pedido;

@SpringBootTest 
public class PedidoRepositorioTests {
    @Autowired
    private PedidoRepositorio pRep;

    @Autowired 
    private ClienteRepositorio cliRep;

    @Test
    public void DeveSalvarUmPedido(){
        Pedido ped = new Pedido();
        var c = cliRep.findById(5).orElseThrow();
        ped.setCliente(c);
        ped.setData(LocalDateTime.parse("2026-09-08T22:00:00"));
        ped.setStatus("Pago");
        ped.setValorTotal(BigDecimal.valueOf(150.20));

        pRep.save(ped);
        assertNotNull(ped.getId());
        assertEquals(6, ped.getId());

    }
}
