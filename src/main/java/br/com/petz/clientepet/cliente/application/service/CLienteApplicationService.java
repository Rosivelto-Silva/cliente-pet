package br.com.petz.clientepet.cliente.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class CLienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse cadastraNovoCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] CLienteApplicationService - cadastraNovoCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

}
