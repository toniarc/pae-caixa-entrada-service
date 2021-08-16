package br.gov.pa.pae.caixaentrada.messaging;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import br.gov.pa.pae.caixaentrada.application.service.CaixaEntradaApplicationService;
import br.gov.pa.pae.caixaentrada.dto.DocumentoProtocolado;

@Component
public class CaixaEntradaConsumerMessageService {
    
    @Autowired
    private CaixaEntradaApplicationService service;

    @JmsListener(destination = "caixa-entrada.documentos-nao-tramimtados")
	public void processMessage(DocumentoProtocolado dto, @Headers Map<String, Object> headers) {
		service.registrarDocumentoProtocolado(dto);
	}

}