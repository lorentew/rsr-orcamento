package br.com.wlorente.rsrorcamento.service;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.dto.mapper.ClienteMapper;
import br.com.wlorente.rsrorcamento.model.Cliente;
import br.com.wlorente.rsrorcamento.service.facade.ClienteRepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    @Autowired
    @Qualifier("PG")
    private ClienteRepositoryFacade repository;

    public void gravar (Cliente cliente){
        repository.save(cliente);
    }

    public ClienteDTO findById(Integer id){
        return ClienteMapper.convert(repository.findById(id).get());
    }

    public List<ClienteDTO> findAll(){

        return ClienteMapper.convert(repository.findAll().stream().map().);
    }

}
