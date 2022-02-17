package ar.com.ifts.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.com.ifts.app.model.Task;
import ar.com.ifts.app.repository.TaskRepository;

@SpringBootTest
public class TaskRepositoryTest {

	@Autowired
	private TaskRepository taskRepository;

	private Task task;
	
	@BeforeEach
	public void init() {
		task = Task.builder().name("test add new task").description("a description").build();
	}
	
	@Test
	public void testAddTask() {
		task = taskRepository.insert(task);
		assertNotNull(task.getId());
	}
	
	@Test
	public void testFindOneTask() {
		assertNotNull(task);
		Task taskFound = taskRepository.findFirstByName(task.getName());
		assertNotNull(taskFound);
		assertEquals("test add new task", taskFound.getName());
	}
}
