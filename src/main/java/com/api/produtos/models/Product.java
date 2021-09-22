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
public class Product implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String Unidade_medida;
    private Integer quantidade_embalagem;
    private Double price;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "fornecedor_id")
    private Fornecedor fornecedor;
    private String descricao;
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String name, String unidade_medida, Integer quantidade_embalagem, Double price,
			Fornecedor fornecedor, String descricao) {
		super();
		this.id = id;
		this.name = name;
		this.Unidade_medida = unidade_medida;
		this.quantidade_embalagem = quantidade_embalagem;
		this.price = price;
		this.fornecedor = fornecedor;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnidade_medida() {
		return Unidade_medida;
	}

	public void setUnidade_medida(String unidade_medida) {
		Unidade_medida = unidade_medida;
	}

	public Integer getQuantidade_embalagem() {
		return quantidade_embalagem;
	}

	public void setQuantidade_embalagem(Integer quantidade_embalagem) {
		this.quantidade_embalagem = quantidade_embalagem;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Unidade_medida, descricao, fornecedor, id, name, price, quantidade_embalagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Unidade_medida, other.Unidade_medida) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(fornecedor, other.fornecedor) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantidade_embalagem, other.quantidade_embalagem);
	}
    
	
	
}
