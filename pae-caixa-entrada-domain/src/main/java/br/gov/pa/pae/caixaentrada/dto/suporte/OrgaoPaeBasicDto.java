package br.gov.pa.pae.caixaentrada.dto.suporte;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class OrgaoPaeBasicDto {

	private Long id;
	private String sigla;
	private String nome;
	private String cnpj;
	private String logo;
	private String entradaProcesso;
	private String saidaProcesso;
	private LocalizacaoBasicDto localizacaoPadraoRecebimento;
	private Date dataHabilitacao;
	
	public OrgaoPaeBasicDto(){
	}
	
	public OrgaoPaeBasicDto(Long id, String sigla, String nome) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrgaoPaeBasicDto other = (OrgaoPaeBasicDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
