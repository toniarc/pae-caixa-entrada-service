package br.gov.pa.pae.caixaentrada.dto;

import java.util.Date;
import java.util.List;

import br.gov.pa.pae.caixaentrada.dto.documento.DocumentoBasicDto;
import br.gov.pa.pae.caixaentrada.dto.nucleopa.MunicipioBasicDto;
import br.gov.pa.pae.caixaentrada.dto.nucleopa.PessoaFisicaBasicDto;
import br.gov.pa.pae.caixaentrada.dto.nucleopa.PessoaJuridicaBasicDto;
import br.gov.pa.pae.caixaentrada.dto.protocolo.DestinoProtocoloDto;
import br.gov.pa.pae.caixaentrada.dto.suporte.AssuntoBasicDto;
import br.gov.pa.pae.caixaentrada.dto.suporte.EspecieBasicDto;
import br.gov.pa.pae.caixaentrada.dto.suporte.LocalizacaoBasicDto;
import br.gov.pa.pae.caixaentrada.dto.suporte.OrgaoPaeBasicDto;
import br.gov.pa.prodepa.pae.common.domain.dto.UsuarioDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DocumentoProtocolado {

	private Long id;

	private Integer anoDocumento;
	private Long numeroDocumento;

	private EspecieBasicDto especie;
	private AssuntoBasicDto assunto;
	private MunicipioBasicDto municipio;
	private DocumentoBasicDto documento;
	
	private String origemDocumento;
	private String complemento;
	private String prioridade;
	private String tipoDestino;
	private List<UsuarioDto> usuariosQueDevemAssinar;
	private List<UsuarioDto> usuariosQueJaAssinaram;

	private List<DestinoProtocoloDto> destinos;

	private String conteudoDocumento;
	private Long modeloConteudoId;
	private List<PessoaFisicaBasicDto> pessoasFisicasInteressadas;
	private List<PessoaJuridicaBasicDto> pessoasJuridicasInteressadas;
	private List<OrgaoPaeBasicDto> orgaosInteressados;
	private List<LocalizacaoBasicDto> localizacoesInteressadas;
	private LocalizacaoBasicDto localizacaoOrigem;
	private OrgaoPaeBasicDto orgaoOrigem;
	
	private Boolean jaFoiTramitado;

	private Long criadoPor;
	private Date criadoEm;
	private Long atualizadoPor;
	private Date atualizadoEm;
}
