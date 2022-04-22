package pe.intercorp.retotech.service;
 
import java.util.List;

import pe.intercorp.retotech.exceptions.ServiceException;
import pe.intercorp.retotech.rest.request.ClientRequestDto;
import pe.intercorp.retotech.rest.response.ClientResponseDto;
import pe.intercorp.retotech.rest.response.KpiClientResponseDto;

public interface ClientService {

	ClientResponseDto create(ClientRequestDto request) throws ServiceException;
	
	KpiClientResponseDto getKpi() throws ServiceException;
	
	List<ClientResponseDto> list() throws ServiceException;
	
}
