package com.api.produtos.models.dto;

import java.io.Serializable;

import com.api.produtos.models.Fornecedor;

public class FornecedorDTO implements Serializable {

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	   private String nome;
	   private String cnpj;
	   private String insc_esta;
	   
	public FornecedorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FornecedorDTO(Fornecedor obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cnpj = obj.getCnpj();
		this.insc_esta = obj.getInsc_esta();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInsc_esta() {
		return insc_esta;
	}
	public void setInsc_esta(String insc_esta) {
		this.insc_esta = insc_esta;
	}
	
	   
}
