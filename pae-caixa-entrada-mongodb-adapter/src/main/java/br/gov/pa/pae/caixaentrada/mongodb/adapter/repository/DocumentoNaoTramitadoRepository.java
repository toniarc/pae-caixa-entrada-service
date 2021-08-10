package br.gov.pa.pae.caixaentrada.mongodb.adapter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.gov.pa.pae.caixaentrada.mongodb.adapter.entity.DocumentoNaoTramitadoMongoEntity;

@Repository
public interface DocumentoNaoTramitadoRepository extends MongoRepository<DocumentoNaoTramitadoMongoEntity, Long>{

}
