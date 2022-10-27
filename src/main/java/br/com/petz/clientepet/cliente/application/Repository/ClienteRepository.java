package br.com.petz.clientepet.cliente.application.Repository;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosCliente();
	Cliente buscarClientePorId(UUID idCliente);

}
