package com.api.produtos.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Contato;
import com.api.produtos.models.Fornecedor;
import com.api.produtos.repositories.ContatoRepository;
import com.api.produtos.repositories.EnderecoRepository;
import com.api.produtos.repositories.FornecedorRepository;
import com.api.produtos.repositories.ProductRepository;

@Service
public class DBService {
  
	@Autowired
    private FornecedorRepository  fornecedorRepository;
	
	@Autowired
    private ContatoRepository  contatoRepository;
	
	@Autowired
    private ProductRepository  produtoRepository;
	
	@Autowired
    private EnderecoRepository  enderecoRepository;
	
	public void InstanciaBaseDeDado() {
		
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
		
		
		forn1.getContato().addAll(Arrays.asList(cont1));
		forn2.getContato().addAll(Arrays.asList(cont2));
		forn3.getContato().addAll(Arrays.asList(cont3));
		forn4.getContato().addAll(Arrays.asList(cont4));
		forn5.getContato().addAll(Arrays.asList(cont5));
		forn6.getContato().addAll(Arrays.asList(cont6));
		forn7.getContato().addAll(Arrays.asList(cont7));
		forn8.getContato().addAll(Arrays.asList(cont8));
		
		fornecedorRepository.saveAll(Arrays.asList(forn1, forn2, forn3, forn4, forn5, forn6, forn7, forn8 ));
	    contatoRepository.saveAll(Arrays.asList(cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8 ));
	}

}
