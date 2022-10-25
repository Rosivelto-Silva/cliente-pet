package br.com.petz.clientepet.cliente.application.service;

import javax.validation.Valid;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse cadastraNovoCliente(@Valid ClienteRequest clienteRequest);
	
	
}
