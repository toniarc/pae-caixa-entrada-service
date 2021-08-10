package br.gov.pa.pae.caixaentrada.mongodb.adapter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.gov.pa.pae.caixaentrada.dto.DocumentoProtocolado;
import br.gov.pa.pae.caixaentrada.mongodb.adapter.entity.DocumentoNaoTramitadoMongoEntity;

@Mapper()
public interface DocumentoNaoTramitadoMapper {

	DocumentoNaoTramitadoMapper INSTANCE = Mappers.getMapper( DocumentoNaoTramitadoMapper.class );
	
	DocumentoProtocolado map(DocumentoNaoTramitadoMongoEntity entity);
	
	DocumentoNaoTramitadoMongoEntity map(DocumentoProtocolado model);
}
