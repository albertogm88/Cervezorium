package com.www.cervezorium.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests().
		antMatchers(HttpMethod.GET, "/cervezas").permitAll().
		antMatchers(HttpMethod.POST, "/cervezas").permitAll().
		antMatchers(HttpMethod.GET, "/cervezas/*").permitAll().
		antMatchers(HttpMethod.GET, "/marcas").permitAll().
		antMatchers(HttpMethod.POST, "/marcas").permitAll().
		antMatchers(HttpMethod.GET, "/paises").permitAll().
		antMatchers(HttpMethod.POST, "/paises").permitAll().
		anyRequest().authenticated();
		
		
	}
}
