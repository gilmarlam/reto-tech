package pe.intercorp.retotech.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pe.intercorp.retotech.exceptions.ServiceException;
import pe.intercorp.retotech.rest.request.ClientRequestDto;
import pe.intercorp.retotech.rest.response.ClientResponseDto;
import pe.intercorp.retotech.service.ClientService;

@Api( tags = "MS Client")
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController extends BaseController {

	@Autowired
	private ClientService clientService;

	@ApiOperation(value = "Creacion del cliente")
	@PostMapping("/creacliente")
	public ResponseEntity<?> creaCliente(@RequestBody @Valid ClientRequestDto request) throws ServiceException {
		return ResponseEntity.ok().body(clientService.create(request));
	}
	
	@ApiOperation(value = "KPI de clientes")
	@GetMapping("/kpideclientes")
	public ResponseEntity<?> kpiClientes() throws ServiceException {
		return ResponseEntity.ok().body(clientService.getKpi());
	}
	
	@ApiOperation(value = "Listado de clientes")
	@GetMapping("/listclientes")
	public ResponseEntity<List<ClientResponseDto>> list() throws ServiceException {
		return ResponseEntity.ok().body(clientService.list());
	}

}
