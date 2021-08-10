package br.gov.pa.pae.caixaentrada.port;

import br.gov.pa.pae.caixaentrada.dto.DocumentoProtocolado;

public interface CaixaEntradaRepository {

    void registrarDocumentoProtocolado(DocumentoProtocolado documentoProtocolado);
}
