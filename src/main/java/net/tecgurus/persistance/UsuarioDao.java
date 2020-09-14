package net.tecgurus.persistance;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import net.tecgurus.controller.dto.UsuarioDto;
import net.tecgurus.util.UsuarioUtil;


@Repository
public class UsuarioDao {
	
	public Collection<UsuarioDto> getAll() {
		return UsuarioUtil.generateUserList(100);
		
	}

}
