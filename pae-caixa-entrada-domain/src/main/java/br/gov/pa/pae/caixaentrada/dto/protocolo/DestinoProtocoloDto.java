package br.gov.pa.pae.caixaentrada.dto.protocolo;

import br.gov.pa.pae.caixaentrada.dto.suporte.LocalizacaoBasicDto;
import br.gov.pa.pae.caixaentrada.dto.suporte.OrgaoPaeBasicDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DestinoProtocoloDto {

    private OrgaoPaeBasicDto orgaoDestino;
	private LocalizacaoBasicDto localizacaoDestino;

}
