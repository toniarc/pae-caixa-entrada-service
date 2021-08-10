package br.gov.pa.pae.caixaentrada.dto.documento;

public enum FormatoPapel {

	A3("A3"),A4("A4"), CARTA("Carta");
	
	private FormatoPapel(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}
	
}
