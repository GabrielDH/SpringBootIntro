package com.tts.SpringBootIntro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class indexController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	/*
	 * Solucion sera:
	 * Seguir estas instrucciones
	 * https://spring.io/guides/gs/handling-form-submission/
	 * 
	 * La pagina tendra 3 categorias
	 * 	Index - Main page con menu bonito
	 * 	Form - un formulario para que lo publique en la base de datos
	 * 	List - Lista de resultados
	 */
}
