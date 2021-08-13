package com.api.produtos.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Fornecedor implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String nome;
   private String cnpj;
   private String insc_esta;
   
  
   
   @OneToMany(mappedBy = "fornecedor")
   private List<Enderecof> enderecof = new ArrayList<>();
   
   @OneToMany(mappedBy = "fornecedor")
   private List<Contato> contato = new ArrayList<>();
   
   
   @OneToMany(mappedBy = "fornecedor")
   private List<Product> product = new ArrayList<>();
   
   

public Fornecedor(Integer id, String nome, String cnpj, String insc_esta) {
	super();
	this.id = id;
	this.nome = nome;
	this.cnpj = cnpj;
	this.insc_esta = insc_esta;

}

public Fornecedor() {
	super();
	// TODO Auto-generated constructor stub
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




public List<Contato> getContato() {
	return contato;
}

public void setContato(List<Contato> contato) {
	this.contato = contato;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}




public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}



public List<Enderecof> getEnderecof() {
	return enderecof;
}

public void setEnderecof(List<Enderecof> enderecof) {
	this.enderecof = enderecof;
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
	Fornecedor other = (Fornecedor) obj;
	return Objects.equals(id, other.id);
}
	
	
	
}
