package pe.intercorp.retotech.service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.intercorp.retotech.constants.ErrorCode;
import pe.intercorp.retotech.entity.ClientEntity;
import pe.intercorp.retotech.exceptions.ServiceException;
import pe.intercorp.retotech.mapper.ClientMapper;
import pe.intercorp.retotech.repository.ClientReposity;
import pe.intercorp.retotech.rest.request.ClientRequestDto;
import pe.intercorp.retotech.rest.response.ClientResponseDto;
import pe.intercorp.retotech.rest.response.KpiClientResponseDto;
import pe.intercorp.retotech.util.ClientUtil;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientReposity clientReposity;

	@Override
	public ClientResponseDto create(ClientRequestDto request) throws ServiceException {
		try {
			return ClientMapper.converDto(clientReposity.save(ClientMapper.converEntity(request)));
		} catch (Exception e) {
			throw new ServiceException(ErrorCode.SQL_INS_001, "Error al crear cliente");
		}
	}

	@Override
	public KpiClientResponseDto getKpi() throws ServiceException {
		try {
			KpiClientResponseDto dto = new KpiClientResponseDto();
			List<ClientEntity> list = clientReposity.findAll();
			dto.setAverage(ClientUtil.getAverage(list));
			dto.setStandardDeviation(ClientUtil.getStandardDeviation(list));
			return dto;
		} catch (Exception e) {
			throw new ServiceException(ErrorCode.SQL_INS_001, "Error al crear cliente");
		}
	}

	@Override
	public List<ClientResponseDto> list() throws ServiceException {
		try {
			List<ClientEntity> list = clientReposity.findAll();
			return list.stream().map(ClientMapper::converDto).map(this::addDate).collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(ErrorCode.SQL_INS_001, "Error al crear cliente");
		}
	}

	private ClientResponseDto addDate(ClientResponseDto dto) {
		int random = (int) (Math.random() * (25000)) + 1;
		Calendar c = Calendar.getInstance();
		c.setTime(dto.getDateOfBirth());
		c.add(Calendar.DATE, random);
		dto.setDateOfDeath(c.getTime());
		return dto;
	}

}
