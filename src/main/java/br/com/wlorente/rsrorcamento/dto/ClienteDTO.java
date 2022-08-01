package br.com.wlorente.rsrorcamento.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ClienteDTO {

    private Integer id;

    private Integer empresaId;

    @Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres")
    private String nome;

    private String documento;

    private String telefone;

    @Email(message="Email inválido")
    private String email;

    private String contato;

    private String observacao;

}
