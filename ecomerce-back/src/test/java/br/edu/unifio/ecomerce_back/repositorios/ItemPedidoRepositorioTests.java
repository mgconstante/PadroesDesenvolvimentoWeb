package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce_back.entidades.ItemPedido;
import br.edu.unifio.ecomerce_back.entidades.Produto;

@SpringBootTest 
public class ItemPedidoRepositorioTests {
    @Autowired 
    private ItemPedidoRepositorio ipRep;

    @Autowired
    private PedidoRepositorio pedRep;

    @Autowired 
    private ProdutoRepositorio pRep;
    @Test 
    public void DeveSalvarUmItemPedido(){
        ItemPedido ip = new ItemPedido();
        var ped = pedRep.findById(5).orElseThrow();
        ip.setPedido(ped);
        var p = pRep.findById(5).orElseThrow();
        ip.setProduto(p);
        ip.setQuantidade(2);
        ip.setValorUnitario(BigDecimal.valueOf(50.0));

        ipRep.save(ip);
        assertNotNull(ip.getId());
        assertEquals(5, ip.getId());
    }
}
