package br.com.petz.clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse cadastraNovoCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> listaTodosCliente();
	ClienteDetalhadoResponse buscaClientePorId(UUID idCliente);

}
