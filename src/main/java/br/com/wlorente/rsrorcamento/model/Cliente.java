package br.com.wlorente.rsrorcamento.model;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="empresa_id")
    private Integer empresa;

    private String nome;

    @Column(name="cpf_cnpj")
    private String documento;

    @Column(name="ddd_telefone")
    private String telefone;

    private String email;

    private String contato;

    private String observacao;

    public Cliente (ClienteDTO clienteDTO){
        this.id = clienteDTO.getId();
        this.empresa = clienteDTO.getEmpresaId();
        this.nome = clienteDTO.getNome();
        this.documento = clienteDTO.getDocumento();
        this.telefone = clienteDTO.getTelefone();
        this.email = clienteDTO.getEmail();
        this.contato = clienteDTO.getContato();
        this.observacao = clienteDTO.getObservacao();
    }

}
