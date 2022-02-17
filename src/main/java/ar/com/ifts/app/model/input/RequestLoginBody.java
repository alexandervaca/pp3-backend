package ar.com.ifts.app.model.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestLoginBody {
	
	@NotBlank(message = "El username no puede ser vacio")
	@Size(max = 60, message = "El username no puede contener más de 30 caracteres")
	private String username;
	
	@NotBlank(message = "La password no puede ser vacia")
	@Size(max = 60, message = "La password no puede contener más de 60 caracteres")
	private String password;
}
