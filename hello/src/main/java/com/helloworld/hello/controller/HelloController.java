package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Classe Controller Usando REST(POST,GET,PUT,DELETE)
public class HelloController {

	@RequestMapping("/hello") //Buidando a URL
	public String hello() {
		return "Olá amigos";
	}
	
}
