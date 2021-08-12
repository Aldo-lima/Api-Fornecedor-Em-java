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
public class Contato implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cargo;
	private String telefone;
	private String telefone_tipo;
	private String email;
	
	 @JsonIgnore
	 @ManyToOne
	 @JoinColumn(name= "fornecedor_id")
	private Fornecedor fornecedor;
	
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contato(Integer id, String nome, String cargo, String telefone, String telefone_tipo, String email,
			Fornecedor fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.telefone = telefone;
		this.telefone_tipo = telefone_tipo;
		this.email = email;
		this.fornecedor = fornecedor;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone_tipo() {
		return telefone_tipo;
	}

	public void setTelefone_tipo(String telefone_tipo) {
		this.telefone_tipo = telefone_tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
		Contato other = (Contato) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
