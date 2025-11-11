package br.fepi.si.parcelamentos.api.controller;

import br.fepi.si.parcelamentos.domain.model.Cliente;
import br.fepi.si.parcelamentos.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @GetMapping ("/clientes")
    public List<Cliente> listar(){

        return clienteRepository.findAll();

    }

    @GetMapping ("/clientes/{clienteId}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId){

        Optional<Cliente> cliente = clienteRepository.findById(clienteId);

        if (cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());
        }

        return ResponseEntity.notFound().build();

    }

}
