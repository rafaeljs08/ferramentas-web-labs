package br.fepi.si.parcelamentos.api.controller;

import br.fepi.si.parcelamentos.domain.model.Cliente;
import br.fepi.si.parcelamentos.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {

        return clienteRepository.findAll();

    }

    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {

        Optional<Cliente> cliente = clienteRepository.findById(clienteId);

        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        }

        return ResponseEntity.notFound().build();

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Cliente inserir(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{clienteId}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long clienteId,
                                             @RequestBody Cliente cliente) {
        if (!clienteRepository.existsById(clienteId)) {
            return ResponseEntity.notFound().build();
        }

        cliente.setId(clienteId);
        cliente = clienteRepository.save(cliente);

        return ResponseEntity.ok(cliente);

    }

}












