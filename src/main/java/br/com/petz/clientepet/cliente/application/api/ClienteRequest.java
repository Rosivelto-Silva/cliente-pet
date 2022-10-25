package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class ClienteRequest {
	@NotEmpty(message = "O campo nome completo não pode estar vazio")
	private String nomeCompleto;
	@NotEmpty(message = "O campo celular completo não pode estar vazio")
	private String celular;
	private String telefone;
	@NotEmpty(message = "O campo email não pode estar vazio")
	private String email;
	@NotEmpty(message = "O campo cpf completo não pode estar vazio")
	private String cpf;
	private Sexo sexo;
	private LocalDate dataNascimento;
	@NotNull
	@Getter(value = AccessLevel.NONE)
	private Boolean aceitaTermos;
}
