package br.gov.pa.pae.caixaentrada.dto.protocolo;

import br.gov.pa.pae.caixaentrada.dto.suporte.LocalizacaoBasicDto;
import br.gov.pa.pae.caixaentrada.dto.suporte.OrgaoPaeBasicDto;
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
public class DestinoProtocoloDto {

    private OrgaoPaeBasicDto orgaoDestino;
	private LocalizacaoBasicDto localizacaoDestino;

}
