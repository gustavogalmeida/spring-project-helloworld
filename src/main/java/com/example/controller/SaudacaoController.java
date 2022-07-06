package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SaudacaoController {
	
	@GetMapping
	public ResponseEntity<?> olaMundo(){
		return ResponseEntity.ok().body("Hello World, azar removido!");
	}
	
}