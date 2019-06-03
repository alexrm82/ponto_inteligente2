package com.test.pontointeligente.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.pontointeligente.service.TesteService;
import com.test.pontointeligente.vo.TestePO;

@RestController
@RequestMapping("/teste")
public class TesteResource {

	@Autowired
	private TesteService testeService;
	
	@GetMapping()
	public String teste() {
		return "teste";
	}
	
	@GetMapping("/{categoria}")
	public ResponseEntity<TestePO> buscarTeste(@PathVariable Integer categoria) {
		TestePO teste = testeService.buscarPorCategoria(categoria);
		return teste != null ? ResponseEntity.ok(teste) : ResponseEntity.notFound().build();
	}
}
