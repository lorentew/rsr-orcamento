package br.com.wlorente.rsrorcamento.dto.mapper;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.model.Cliente;

public class ClienteMapper {
    public static ClienteDTO convert(Cliente cliente){
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .documento(cliente.getDocumento())
                .contato(cliente.getContato())
                .email(cliente.getEmail())
                .empresaId(cliente.getEmpresa())
                .observacao(cliente.getObservacao())
                .build();
    }
}
