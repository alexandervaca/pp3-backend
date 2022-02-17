package ar.com.ifts.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.com.ifts.app.model.Permiso;

public interface PermisoRepository extends MongoRepository<Permiso, String> {
	
	public Permiso findByDescPermiso(String descPermiso);
}
