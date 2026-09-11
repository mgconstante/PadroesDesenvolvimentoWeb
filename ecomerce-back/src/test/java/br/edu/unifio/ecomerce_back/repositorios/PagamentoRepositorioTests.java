package br.edu.unifio.ecomerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce_back.entidades.Pagamento;

@SpringBootTest 
public class PagamentoRepositorioTests {
    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Autowired 
    private PedidoRepositorio pedidoRepositorio;

    @Test 
    public void deveSalavarUmPagamento(){
        Pagamento pagamento = new Pagamento();
        var pedido = pedidoRepositorio.findById(6).orElseThrow();

        pagamento.setValor(BigDecimal.valueOf(100));
        pagamento.setStatus("Recebido");        
        pagamento.setPedido(pedido);
        pagamento.setData(LocalDateTime.parse("2026-09-08T22:00:00"));
        pagamento.setTipo("Credito");
        
        pagamentoRepositorio.save(pagamento);
        assertNotNull(pagamento);
    }
}
