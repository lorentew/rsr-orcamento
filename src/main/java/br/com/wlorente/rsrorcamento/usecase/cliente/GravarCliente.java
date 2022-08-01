package br.com.wlorente.rsrorcamento.usecase.cliente;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.model.Cliente;
import br.com.wlorente.rsrorcamento.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class GravarCliente {

    private final ClienteService service;

    public Cliente executar(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente(clienteDTO);
        service.gravar(cliente);
        return cliente;
    }
}
