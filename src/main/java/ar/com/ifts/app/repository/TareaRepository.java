package ar.com.ifts.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.com.ifts.app.model.Tarea;

public interface TareaRepository extends MongoRepository<Tarea, String> {

	public Tarea findFirstByNombre(String nombre);
	
	public List<Tarea> findByNombre(String nombre);
}
