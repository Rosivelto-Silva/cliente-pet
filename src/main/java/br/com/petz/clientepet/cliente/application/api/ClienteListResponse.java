package br.com.petz.clientepet.cliente.application.api;

import java.util.UUID;

import lombok.Getter;

@Getter
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular;
	private String telefone;
	private String email;
}
