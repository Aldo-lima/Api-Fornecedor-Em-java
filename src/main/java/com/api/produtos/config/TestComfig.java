package com.api.produtos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.produtos.service.DBService;

@Configuration
@Profile("test")
public class TestComfig {
	@Autowired
	private DBService dbService;
	
	
	
	@Bean
	public void instaciaBaseDeDados() {
		this.dbService.InstanciaBaseDeDado();
		}
		
	
	
	
}
