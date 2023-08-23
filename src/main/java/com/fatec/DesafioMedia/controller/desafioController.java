package com.fatec.DesafioMedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class desafioController {

	@GetMapping("/calcularMedia/{nota1}/{nota2}")
	public String calcularMedia(@PathVariable double nota1, @PathVariable double nota2, ModelMap model) {
	    model.addAttribute("nota1", nota1);
	    model.addAttribute("nota2", nota2);

	    double media = (nota1 + nota2) / 2;
	    model.addAttribute("media", media);

	    return "media";
	}

}
