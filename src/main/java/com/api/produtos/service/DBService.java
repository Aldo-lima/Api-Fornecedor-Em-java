package com.api.produtos.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Categoria;
import com.api.produtos.models.Contato;
import com.api.produtos.models.Fornecedor;
import com.api.produtos.models.Product;
import com.api.produtos.repositories.CategoriaRepository;
import com.api.produtos.repositories.ContatoRepository;
import com.api.produtos.repositories.EnderecoRepository;
import com.api.produtos.repositories.FornecedorRepository;
import com.api.produtos.repositories.ProductRepository;

@Service
public class DBService {
	@Autowired
	 private CategoriaRepository categoriarepository;

	
	
	@Autowired
    private FornecedorRepository  fornecedorRepository;
	
	@Autowired
    private ContatoRepository  contatoRepository;
	
	@Autowired
    private ProductRepository  produtoRepository;
	
	@Autowired
    private EnderecoRepository  enderecoRepository;
	
	public void InstanciaBaseDeDado() {
		
		
		Categoria cat1 = new Categoria(null, "Alimento");
		Categoria cat2 = new Categoria(null, "brinquedo");
		Categoria cat5 = new Categoria(null, "joia");
		Categoria cat3 = new Categoria(null, "eletr");
		Categoria cat4 = new Categoria(null, "camas");
		
		
		Fornecedor forn1 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn2 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn3 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn4 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn5 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn6 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn7 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		Fornecedor forn8 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451");
		
		Contato cont1 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn1);
		Contato cont2 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn2);
		Contato cont3 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn3);
		Contato cont4 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn4);
		Contato cont5 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn5);
		Contato cont6 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn6);
		Contato cont7 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn7);
		Contato cont8 = new Contato(null, "josé", "gerente", "18-3885-4748", "celular", "josé@gmail.com", forn8);
		
		Product podu1 = new Product(null, "sabonete","unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu2 = new Product(null, "sabonete", "unidade",1,2.45, forn1, "com bom cheiro");
		Product podu3 = new Product(null, "sabonete","unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu4 = new Product(null, "sabonete","unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu5 = new Product(null, "sabonete","unidade",1, 2.50, forn2, "com bom cheiro");
		Product podu6 = new Product(null, "sabonete", "unidade",1, 2.50, forn3, "com bom cheiro");
		Product podu7 = new Product(null, "sabonete","unidade",1, 2.50, forn4, "com bom cheiro");
		Product podu8 = new Product(null, "sabonete","unidade",1, 2.50, forn5, "com bom cheiro");
		Product podu9 = new Product(null, "sabonete","unidade",1, 2.50, forn3, "com bom cheiro");
		Product podu10 = new Product(null, "sabonete","unidade",1, 2.50, forn6, "com bom cheiro");
		
		Product podu11 = new Product(null, "sabonete","unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu12 = new Product(null, "sabonete", "unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu13 = new Product(null, "sabonete","unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu14 = new Product(null, "sabonete","unidade",1, 2.50, forn1, "com bom cheiro");
		Product podu15 = new Product(null, "sabonete","unidade",1, 2.50, forn2, "com bom cheiro");
		Product podu16 = new Product(null, "sabonete", "unidade",1,2.50, forn3, "com bom cheiro");
		Product podu17 = new Product(null, "sabonete","unidade",1, 2.50, forn4, "com bom cheiro");
		Product podu18 = new Product(null, "sabonete","unudade",1, 2.50, forn5, "com bom cheiro");
		Product podu19 = new Product(null, "sabonete","'unidade",1, 2.50, forn3, "com bom cheiro");
		Product podu20 = new Product(null, "sabonete","unidade",1, 2.50, forn6, "com bom cheiro");
		
		forn1.getContato().addAll(Arrays.asList(cont1));
		forn2.getContato().addAll(Arrays.asList(cont2));
		forn3.getContato().addAll(Arrays.asList(cont3));
		forn4.getContato().addAll(Arrays.asList(cont4));
		forn5.getContato().addAll(Arrays.asList(cont5));
		forn6.getContato().addAll(Arrays.asList(cont6));
		forn7.getContato().addAll(Arrays.asList(cont7));
		forn8.getContato().addAll(Arrays.asList(cont8));
		
		forn1.setCategoria(cat1);
		forn2.setCategoria(cat2);
		forn3.setCategoria(cat3);
		forn4.setCategoria(cat4);
	    forn5.setCategoria(cat5);
	    forn6.setCategoria(cat5);
	    forn7.setCategoria(cat5);
	    forn8.setCategoria(cat5);
	    
		cat1.getFornecedor().add(forn1);
		cat2.getFornecedor().add(forn2);
		cat3.getFornecedor().add(forn3);
		cat4.getFornecedor().add(forn4);
		cat5.getFornecedor().addAll(Arrays.asList(forn5,forn6,forn7,forn8));
		
		forn1.getProduct().addAll(Arrays.asList(podu1, podu2, podu3, podu4, podu11, podu12, podu13, podu14 ));
		forn2.getProduct().addAll(Arrays.asList(podu6, podu9, podu16, podu19));
		forn3.getProduct().addAll(Arrays.asList(podu5, podu15));
		forn4.getProduct().addAll(Arrays.asList(podu7, podu17));
		forn5.getProduct().addAll(Arrays.asList(podu8, podu18));
		forn6.getProduct().addAll(Arrays.asList(podu10, podu20));
		
		
	    categoriarepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		fornecedorRepository.saveAll(Arrays.asList(forn1, forn2, forn3, forn4, forn5, forn6, forn7, forn8 ));
	    contatoRepository.saveAll(Arrays.asList(cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8 ));
	    produtoRepository.saveAll(Arrays.asList(podu1, podu2, podu3, podu4, podu5, podu6, podu7, podu8, podu9, podu10, podu11, podu12, podu13, podu14, podu15, podu16, podu17, podu18, podu19, podu20 ));
	   
	}

}
