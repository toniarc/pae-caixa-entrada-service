package br.gov.pa.pae.caixaentrada.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.gov.pa.pae.caixaentrada.dto.DocumentoProtocolado;
import br.gov.pa.pae.caixaentrada.service.CaixaEntradaService;

@Component
@Transactional(rollbackFor = Throwable.class)
public class CaixaEntradaApplicationService {
    
    @Autowired
    private CaixaEntradaService service;

    public void registrarDocumentoProtocolado(DocumentoProtocolado dp){
        service.registrarDocumentoProtocolado(dp);
    }
}
