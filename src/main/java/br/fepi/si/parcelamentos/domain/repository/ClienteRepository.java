package br.fepi.si.parcelamentos.domain.repository;

import br.fepi.si.parcelamentos.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    List<Cliente> findByNomeContaining (String nome);

    List<Cliente> findByNomeStartingWith (String nome);
}
