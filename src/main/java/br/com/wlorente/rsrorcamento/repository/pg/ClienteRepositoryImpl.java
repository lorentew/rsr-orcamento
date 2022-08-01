package br.com.wlorente.rsrorcamento.repository.pg;

import br.com.wlorente.rsrorcamento.model.Cliente;
import br.com.wlorente.rsrorcamento.repository.pg.jpa.ClienteRepository;
import br.com.wlorente.rsrorcamento.service.facade.ClienteRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component("PG")
@Primary
public class ClienteRepositoryImpl implements ClienteRepositoryFacade {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

}
