package br.gov.pa.pae.caixaentrada.dto.documento;

public enum OrientacaoPapel {

	LANDSCAPE("Landscape"), PORTRAIT("Portrait");
	
	private OrientacaoPapel(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}
}
