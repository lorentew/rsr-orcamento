package br.com.wlorente.rsrorcamento.repository.facade;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ClienteRepositoryFacade {
    Optional<Cliente> findById(Integer id);
    Cliente save(Cliente cliente);
    List<Cliente> findAll();
}
