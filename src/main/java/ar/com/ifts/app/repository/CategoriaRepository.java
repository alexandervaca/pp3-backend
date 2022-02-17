package ar.com.ifts.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import ar.com.ifts.app.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, String> {
	
//	public Optional<Categoria> findByIdCategoria(Long idCategoria);
//	
//	public Optional<Categoria> findByDescCategoria(String descCategoria);
//	
	public List<Categoria> findAll();
	
}
