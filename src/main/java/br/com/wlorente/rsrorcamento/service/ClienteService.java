package br.com.wlorente.rsrorcamento.service;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.dto.mapper.ClienteMapper;
import br.com.wlorente.rsrorcamento.model.Cliente;
import br.com.wlorente.rsrorcamento.repository.facade.ClienteRepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

        List<ClienteDTO> result = repository.findAll().stream().map(temp -> {
            ClienteDTO obj = new ClienteDTO();
            obj.setId(temp.getId());
            obj.setNome(temp.getNome());
            obj.setDocumento(temp.getDocumento());
            obj.setEmpresaId(temp.getEmpresa());
            obj.setContato(temp.getContato());
            obj.setEmail(temp.getEmail());
            obj.setObservacao(temp.getObservacao());
            obj.setTelefone(temp.getTelefone());
            return obj;
        }).collect(Collectors.toList());
        return result;
    }

}
