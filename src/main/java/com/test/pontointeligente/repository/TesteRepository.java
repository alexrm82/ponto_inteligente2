package com.test.pontointeligente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.pontointeligente.vo.TestePO;


/**
 * InterfaceTesteRepository, nao necessita o desenvolvimento de uma implementacao. JpaRepository fornece uma implementacao, contendo Metodos basicos de acesso para entidade VeiculoIntegradoraPO.
 * @author Francisco Alves - @faalves
 */

public interface TesteRepository extends JpaRepository<TestePO, Long> {

	
	TestePO findByCategoria(Integer categoria);
	
}
