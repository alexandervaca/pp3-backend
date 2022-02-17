package ar.com.ifts.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ifts.app.model.Tarea;
import ar.com.ifts.app.repository.TareaRepository;

@Service
public class TareaService {

	@Autowired
	private TareaRepository tareaRepository;
	
	public List<Tarea> getTareas() {
		return tareaRepository.findAll();
	}
}
