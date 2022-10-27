package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular;
	private String telefone;
	private String email;

	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream().map(ClienteListResponse::new).collect(Collectors.toList());
	}

	public ClienteListResponse(Cliente cliente) {
		super();
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
	}
}
