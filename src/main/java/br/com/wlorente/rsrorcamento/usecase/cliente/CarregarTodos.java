package br.com.wlorente.rsrorcamento.usecase.cliente;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class CarregarTodos {

    private final ClienteService service;

    public List<ClienteDTO> executar(){
        return service.findAll();
    }
}
