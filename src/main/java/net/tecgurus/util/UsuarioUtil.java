package net.tecgurus.util;

import java.util.ArrayList;
import java.util.Collection;

import net.tecgurus.controller.dto.UsuarioDto;


public class UsuarioUtil {

	public static Collection<UsuarioDto> generateUserList(Integer number){
		
		Collection<UsuarioDto> list = new ArrayList<UsuarioDto>();
		for(int i = 0; i < number ;i++) {
			list.add(new UsuarioDto("GYO"+i, "magyo"+i+"@gmail.com", "tenerife 5838"+i, 39+i ));
		}
		return list;
		
	}
	
}
