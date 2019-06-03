package com.test.pontointeligente.vo;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe PO Persistence Object da tabela (VEICULO)
 * @author Francisco Alves faalves
 */
@Entity
@Table(name = "TESTE", schema = "ARMEDEIROS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestePO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TesteSeq", sequenceName = "SEQ_TESTE", schema = "ARMEDEIROS", allocationSize = 1)
	@GeneratedValue(generator = "TesteSeq", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_TESTE", nullable = false)
	private Long cdTeste;

	//@NotEmpty
	@Length(max = 7)
	@Column(name = "DESCRICAO", nullable = false)
	private String descricao;

	@Column(name = "CATEGORIA")
	private Integer categoria;
	
	//@OneToMany(fetch = FetchType.EAGER, mappedBy = "veiculo", cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<VeiculoComplementoPO> complementos;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cdTeste == null ? 0 : cdTeste.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TestePO other = (TestePO) obj;
		if (cdTeste == null) {
			if (other.cdTeste != null) {
				return false;
			}
		} else if (!cdTeste.equals(other.cdTeste)) {
			return false;
		}
		return true;
	}

	public Long getCdTeste() {
		return cdTeste;
	}

	public void setCdTeste(Long cdTeste) {
		this.cdTeste = cdTeste;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	
	

}
