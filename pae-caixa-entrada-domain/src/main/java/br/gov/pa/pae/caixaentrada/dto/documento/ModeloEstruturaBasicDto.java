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
@AllArgsConstructor
@NoArgsConstructor
public class ModeloEstruturaBasicDto implements Serializable{

	private static final long serialVersionUID = 3747970021756241802L;
	
	private Long id;
	private String cabecalho;
	private String rodape;
	private String titulo;
	private FormatoPapel formato;
	private OrientacaoPapel orientacao;
	private Margem margens;
	
	public boolean estaEmEdicao() {
		return this.id != null;
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
		ModeloEstruturaBasicDto other = (ModeloEstruturaBasicDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

