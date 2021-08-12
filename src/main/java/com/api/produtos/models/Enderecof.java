package com.api.produtos.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Enderecof  implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String proximidade;
    private String cep;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "fornecedor_id")
    private Fornecedor fornecedor;
	public Enderecof() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enderecof(Integer id, String rua, String numero, String bairro, String cidade, String estado,
			String proximidade, String cep, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.proximidade = proximidade;
		this.cep = cep;
		this.fornecedor = fornecedor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getProximidade() {
		return proximidade;
	}
	public void setProximidade(String proximidade) {
		this.proximidade = proximidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enderecof other = (Enderecof) obj;
		return Objects.equals(id, other.id);
	} 

    
	
	
}
