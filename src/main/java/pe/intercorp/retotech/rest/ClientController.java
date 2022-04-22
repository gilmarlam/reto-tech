package pe.intercorp.retotech.rest;

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
import pe.intercorp.retotech.rest.request.ClientRequestDto;
import pe.intercorp.retotech.service.ClientService;

@Api( tags = "API Client")
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController extends BaseController {

	@Autowired
	private ClientService clientService;

	@PostMapping("/creacliente")
	public ResponseEntity<?> creaCliente(@RequestBody @Valid ClientRequestDto request) {
		return ResponseEntity.ok().body(clientService.create(request));
	}
	
	@GetMapping("/kpideclientes")
	public ResponseEntity<?> kpiClientes() {
		return ResponseEntity.ok().body(clientService.getKpi());
	}
	
	@GetMapping("/listclientes")
	public ResponseEntity<?> list() {
		return ResponseEntity.ok().body(clientService.list());
	}

}
