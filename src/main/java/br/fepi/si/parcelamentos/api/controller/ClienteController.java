package br.fepi.si.parcelamentos.api.controller;

import br.fepi.si.parcelamentos.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class ClienteController {

    @GetMapping ("/clientes")
    public List<Cliente> listar(){

        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Joana");
        cliente1.setEmail("joao@fepi.br");
        cliente1.setTelefone("126549-4564");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setEmail("maria@fepi.br");
        cliente2.setTelefone("15988-4000");

        return Arrays.asList(cliente1, cliente2);
    }


}
