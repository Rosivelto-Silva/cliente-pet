package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCadastraNovoCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCadastraNovoCliente");
		ClienteResponse novoCliente = clienteService.cadastraNovoCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCadastraNovoCliente");
		return novoCliente;
	}

	@Override
	public List<ClienteListResponse> getListaTodosClientes() {
		log.info("[inicia] ClienteController - getListaTodosCliente");
		List<ClienteListResponse> listaClientes = clienteService.listaTodosCliente();
		log.info("[finaliza] ClienteController - getListaTodosCliente");
		return listaClientes;
	}

	@Override
	public ClienteDetalhadoResponse getBuscarClienteId(UUID idCliente) {
		log.info("[inicia] ClienteController - getBuscarClienteId");
		ClienteDetalhadoResponse detalhes = clienteService.buscaClientePorId(idCliente);
		log.info("[finaliza] ClienteController - getBuscarClienteId");
		return detalhes;
	}

}
