package br.gov.pa.pae.caixaentrada.dto.documento;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModeloConteudoBasicDto implements Serializable {

	private static final long serialVersionUID = 7807614409398264399L;
	
	private Long id;
	private String nome;
	private ModeloEstruturaBasicDto modeloEstrutura;

}
