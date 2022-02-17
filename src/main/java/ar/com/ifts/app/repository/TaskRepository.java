package ar.com.ifts.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.com.ifts.app.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

	public Task findFirstByName(String name);
	public List<Task> findByName(String name);
}
