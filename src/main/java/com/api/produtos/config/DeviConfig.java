package com.api.produtos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.produtos.service.DBService;

@Configuration
@Profile("dev")
public class DeviConfig {

	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instaciaBaseDeDados() {
		if(strategy.equals("create")) {
			this.dbService.InstanciaBaseDeDado();
		}
		return false;
	}
	
}
