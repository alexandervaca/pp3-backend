package ar.com.ifts.app.model.output;

import java.util.List;

import ar.com.ifts.app.model.Tarea;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetTareasResponse extends Response {

	private List<Tarea> tasks;
	
}
