package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.petz.clientepet.cliente.domain.Cliente;
import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class ClienteDetalhadoResponse {
	private String nomeCompleto;
	private String celular;
	private String telefone;
	private String email;
	private String cpf;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		super();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
		this.cpf = cliente.getCpf();
		this.sexo = cliente.getSexo();
		this.dataNascimento = cliente.getDataNascimento();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();;
	}

}
