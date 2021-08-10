package br.gov.pa.pae.caixaentrada.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.gov.pa.pae.caixaentrada.dto.DocumentoProtocolado;
import br.gov.pa.pae.caixaentrada.mongodb.adapter.entity.DocumentoNaoTramitadoMongoEntity;
import br.gov.pa.pae.caixaentrada.mongodb.adapter.mapper.DocumentoNaoTramitadoMapper;
import br.gov.pa.pae.caixaentrada.mongodb.adapter.repository.DocumentoNaoTramitadoRepository;
import br.gov.pa.pae.caixaentrada.port.CaixaEntradaRepository;

@Component
public class CaixaEntradaPersistenceAdapter implements CaixaEntradaRepository {

	@Autowired
	private DocumentoNaoTramitadoRepository documentoNaoTramitadoRepository;
	
    public void registrarDocumentoProtocolado(DocumentoProtocolado dp){
    	DocumentoNaoTramitadoMongoEntity entity = DocumentoNaoTramitadoMapper.INSTANCE.map(dp);
    	documentoNaoTramitadoRepository.save(entity);
    }
}