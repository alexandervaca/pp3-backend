package ar.com.ifts.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.context.SpringBootTest;

import ar.com.ifts.app.model.Tarea;
import ar.com.ifts.app.repository.TareaRepository;

@SpringBootTest
@AutoConfigureDataMongo
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TareaRepositoryTest {

	@Autowired
	private TareaRepository tareaRepository;

	@BeforeAll
	public void setup() {
		tareaRepository.insert(Tarea.builder().nombre("nueva tarea 1 test").descripcion("una descripcion").build());
		tareaRepository.insert(Tarea.builder().nombre("nueva tarea 2 test").descripcion("una descripcion").build());
		tareaRepository.insert(Tarea.builder().nombre("nueva tarea 3 test").descripcion("una descripcion").build());
	}
	
	@Test
	public void testFindFirstByNombre() {
		Tarea tareaEncontrada = tareaRepository.findFirstByNombre("nueva tarea 1 test");
		assertNotNull(tareaEncontrada);
		assertEquals("nueva tarea 1 test", tareaEncontrada.getNombre());
	}
}
