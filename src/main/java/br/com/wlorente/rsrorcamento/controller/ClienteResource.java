package br.com.wlorente.rsrorcamento.controller;

import br.com.wlorente.rsrorcamento.dto.ClienteDTO;
import br.com.wlorente.rsrorcamento.model.Cliente;
import br.com.wlorente.rsrorcamento.service.ClienteService;
import br.com.wlorente.rsrorcamento.usecase.cliente.CarregaClientePorId;
import br.com.wlorente.rsrorcamento.usecase.cliente.CarregarTodos;
import br.com.wlorente.rsrorcamento.usecase.cliente.GravarCliente;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value="/api/clientes")
@AllArgsConstructor
public class ClienteResource {

    private final GravarCliente gravarCliente;
    private final CarregaClientePorId carregaClientePorId;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody ClienteDTO clienteDTO){
        Cliente cliente = gravarCliente.executar(clienteDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@Valid @PathVariable Integer id){
        return ResponseEntity.ok(carregaClientePorId.executar(id));
    }

    @GetMapping("/list")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(CarregarTodos.executar());
    }

}
