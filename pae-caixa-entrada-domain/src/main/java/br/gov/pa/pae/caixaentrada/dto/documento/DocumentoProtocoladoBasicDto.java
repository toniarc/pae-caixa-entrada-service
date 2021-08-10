package br.gov.pa.pae.caixaentrada.dto.documento;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentoProtocoladoBasicDto {

	private Long id;
	private Integer ano;
	private Long numero;
	private Date dataCadastro;
}
