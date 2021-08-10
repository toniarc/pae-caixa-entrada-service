package br.gov.pa.pae.caixaentrada.application.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.gov.pa.pae.caixaentrada.port.CaixaEntradaRepository;
import br.gov.pa.pae.caixaentrada.service.CaixaEntradaDomainService;
import br.gov.pa.pae.caixaentrada.service.CaixaEntradaService;

@Configuration
public class DomainRegistry {
    
    @Autowired
    private ApplicationContext context;

    @Bean
    public CaixaEntradaService createCaixaEntradaService(){
        return new CaixaEntradaDomainService(context.getBean(CaixaEntradaRepository.class));
    }
}
