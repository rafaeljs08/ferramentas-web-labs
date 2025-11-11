package br.fepi.si.parcelamentos.api.controller;

import br.fepi.si.parcelamentos.domain.model.Cliente;
import br.fepi.si.parcelamentos.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @GetMapping ("/clientes")
    public List<Cliente> listar(){

        //return clienteRepository.findAll();
        //return clienteRepository.findByNome("Leonardo DiCaprio");
        return clienteRepository.findByNomeStartingWith("Ke");
    }

}
