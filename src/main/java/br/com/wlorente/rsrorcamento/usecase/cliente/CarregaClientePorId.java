package br.com.wlorente.rsrorcamento.usecase.cliente;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CarregaClientePorId {

    private final ClienteService service;

    public ClienteDTO executar(Integer id){
        return service.findById(id);
    }
}
