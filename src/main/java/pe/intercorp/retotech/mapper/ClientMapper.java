package pe.intercorp.retotech.mapper;
 
import java.util.Date;

import pe.intercorp.retotech.entity.ClientEntity;
import pe.intercorp.retotech.rest.request.ClientRequestDto;
import pe.intercorp.retotech.rest.response.ClientResponseDto; 

public class ClientMapper {
	
	public static ClientResponseDto converDto(ClientEntity entity) {
		if(entity==null) {		 
			return null;
		}
		
		ClientResponseDto dto = new ClientResponseDto();
		dto.setId(entity.getId());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setAge(entity.getAge());
		dto.setDateOfBirth(entity.getDateOfBirth());
		return dto;
	}
	
	public static ClientEntity converEntity(ClientRequestDto req) {
		if(req==null) {		 
			return null;
		}
		
		ClientEntity entity = new ClientEntity();
		entity.setFirstName(req.getFirstName());
		entity.setLastName(req.getLastName());
		entity.setAge(req.getAge());
		entity.setDateOfBirth(req.getDateOfBirth());
		entity.setCreated(new Date());
		return entity;
	}

}
