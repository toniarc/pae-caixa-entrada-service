package br.gov.pa.pae.caixaentrada.service;

import br.gov.pa.pae.caixaentrada.dto.DocumentoProtocolado;
import br.gov.pa.pae.caixaentrada.port.CaixaEntradaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CaixaEntradaDomainService implements CaixaEntradaService {  
 
    private final CaixaEntradaRepository repository;

    public void registrarDocumentoProtocolado(DocumentoProtocolado documentoProtocolado){
        repository.registrarDocumentoProtocolado(documentoProtocolado);
    }
}
