package br.com.petz.clientepet.cliente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.petz.clientepet.cliente.application.Repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		Cliente salvaCliente = clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return salvaCliente;
	}

	@Override
	public List<Cliente> buscaTodosCliente() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosCliente");
		List<Cliente> buscaTodos = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosCliente");
		return buscaTodos;
	}

}
