package net.tecgurus.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.controller.dto.UsuarioDto;
import net.tecgurus.persistance.UsuarioDao;
import net.tecgurus.util.UsuarioUtil;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	
	@GetMapping("/usuario")
	public UsuarioDto consultar() {
		
		return new UsuarioDto("GYO", "magyo@gmail.com", "tenerife 5838", 39);
		
	}
	
	@GetMapping("/usuario/todos")
	public Collection<UsuarioDto> consultarTodos(@RequestParam(required = false) Integer numero){
		
//		return UsuarioUtil.generateUserList(numero);
		return usuarioDao.getAll();
		
	}
	
	@RequestMapping(value = "/usuario" , method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	
	public UsuarioDto create( Integer edad) {
		return new UsuarioDto("GYO", "magyo@gmail.com", "paseo alicate 21", edad);
	}
	
	@PostMapping("/usuario/json")
	public UsuarioDto crearJson(@RequestBody UsuarioDto usuarioDto) {
		
		System.out.println("Nombre: " + usuarioDto.getName() );
		System.out.println("Edad" + usuarioDto.getEdad());
		
		return usuarioDto;
		
	}

	
	@PostMapping("/usuario/json/lista")
	public List<UsuarioDto> crearJsonLista(@RequestBody List<UsuarioDto> ListaU) {
		
		System.out.println("Nombre: " + ListaU.size() );
		
		return ListaU;
		
	}
	
//	@PutMapping("/usuario/{id}")
//	public UsuarioDto actualizar(@PathVariable Integer id) {
//		System.out.println("Actualizacion del usaurio id: "+id);
//		
//		return new UsuarioDto("GYO", "magyo@gmail.com", "paseo alicate 21", 33);
//		
//		
//		
//	}
	

	
	@PutMapping("/usuario2/{id}")
	public ResponseEntity<UsuarioDto> actualizarEx(@PathVariable Integer id, @RequestBody UsuarioDto usuarioDto) {
		System.out.println("Actualizacion del usaurio id: "+id);
		ResponseEntity<UsuarioDto> respuesta = 
				new ResponseEntity<UsuarioDto>(
						usuarioDto,
						HttpStatus.ACCEPTED
						);
		
		return respuesta;
		
	}


}
