package com.test.pontointeligente.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.pontointeligente.repository.TesteRepository;
import com.test.pontointeligente.vo.TestePO;

/**
* Classe responsavel por disponibilizar servicos insert e buscas no  schema 
* @author Francisco Alves - faalves
*/
@Service
public class TesteService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	private final Marker marker = MarkerFactory.getMarker("PLACA");
	//private static final String BUSCAR_POR_PLACA = "buscarPorPlaca";

	@Autowired
	private TesteRepository testeRepository;

	/**
	 *
	 * @param categoria
	 * @return TestePO
	 */
	public TestePO buscarPorCategoria(Integer categoria) {
		
		//log.info(marker, "findByCategoria {} in oracle database...", categoria);
				
		TestePO testePO = testeRepository.findByCategoria(categoria);
		if (testePO == null) {
			log.info(marker, "not found {}  in oracle", categoria);
			
		}
		//this.saveLog(logComunicacaoPO, testePO);
		
		return testePO;
	}

	
	/*
	
	/**
	 * saveLog
	 * @param logComunicacaoPO
	 * @param testePO
	 */
/*	private void saveLog(LogComunicacaoPO logComunicacaoPO, TestePO testePO) {
		log.info("into the saveLog method ...");
		logComunicacaoPO.setDtRespostaCliente(new Date());
		logComunicacaoPO.setRespostaCliente(this.parserVeiculoToJson(testePO));
		logComunicacaoRepository.save(logComunicacaoPO);
	}*/

	

}
