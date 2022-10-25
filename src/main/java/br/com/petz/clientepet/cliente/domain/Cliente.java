package br.com.petz.clientepet.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID", name = "idCliente", nullable = false, unique = true, updatable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private String telefone;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@CPF
	private String cpf;
	@Enumerated
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@NotNull
	@Getter(value = AccessLevel.NONE)
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.celular = clienteRequest.getCelular();
		this.telefone = clienteRequest.getTelefone();
		this.email = clienteRequest.getEmail();
		this.cpf = clienteRequest.getCpf();
		this.sexo = clienteRequest.getSexo();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();

	}

}
