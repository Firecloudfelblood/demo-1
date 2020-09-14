package net.tecgurus.controller.dto;

public class UsuarioDto {
	
	private String name;
	private String email;
	private String direccion;
	private Integer edad;
	
	
	
	public UsuarioDto() {
		super();
	}

	public UsuarioDto(String name, String email, String direccion, Integer edad) {
		super();
		this.name = name;
		this.email = email;
		this.direccion = direccion;
		this.edad = edad;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
