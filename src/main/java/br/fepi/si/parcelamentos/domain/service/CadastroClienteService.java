package br.fepi.si.parcelamentos.domain.service;
import br.fepi.si.parcelamentos.domain.exception.BusinessException;
import br.fepi.si.parcelamentos.domain.model.Cliente;
import br.fepi.si.parcelamentos.domain.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service   //anotar e marcas somente , nao tem uma funçao especifica
public class CadastroClienteService {
    private final ClienteRepository clienteRepository;
    @Transactional // so faz se nao ocorrer nenhum erro
    public  Cliente salvar(Cliente cliente){
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail()).
                filter(c -> !c.equals(cliente)).isPresent();
        if(emailEmUso){
            throw  new BusinessException("Email em uso,favor alterar.");
        }
        return clienteRepository.save(cliente);
    }
    @Transactional  // so acontece se nao houver erro
    public void excluir (long clienteId){
        clienteRepository.deleteById(clienteId);
    }
}