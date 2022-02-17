package ar.com.ifts.app.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ifts.app.model.output.GetTareasResponse;
import ar.com.ifts.app.services.TareaService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class TareaController {

	@Autowired
	private TareaService tareaService;

	@GetMapping(value = "/tareas", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<GetTareasResponse> getTareas() {
		log.info("TareaController::getTareas");
		
		GetTareasResponse tareas = GetTareasResponse.builder()
			.status("Consulta de tareas exitosa.")
			.code(String.valueOf(OK.ordinal()))
			.date(LocalDate.now())
			.tasks(tareaService.getTareas()).build();
		
		return ResponseEntity.ok(tareas);
	}
}
