package net.tecgurus.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	@GetMapping("/holamundo")
	public String saludar() {
		return "Hola Mundo";
	}
	
	@PostMapping("/holamundo")
	public String saludarPost() {
		return "Saludo POST";
	}
	
	@DeleteMapping("/holamundo")
	public String saludaDelete() {
		return "saludo Delete";
	}
	
	@PutMapping("/holamundo")
	public String saludaPut() {
		return "saluda Put";
	}
}
