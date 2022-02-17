package ar.com.ifts.app.model.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestRegisterBody {

	@NotBlank(message = "El usuuario no puede ser vacío.")
	@Size(min = 5, max = 30, message = "El nombre de usuario debe contener al menos 5 y máximo 30 caracteres.")
	private String username;
	
	@NotBlank(message = "La contraseña no puede ser vacío.")
	@Size(min = 5, max = 30, message = "La contraseña debe contener al menos 5 y máximo 30 caracteres.")
	private String password;
	
	@NotBlank
	private String permiso;
	
	@NotBlank(message = "El mail no puede ser vacío.")
	@Size(min = 5, max = 30, message = "El mail debe contener al menos 5 y máximo 30 caracteres.")
	private String mail;
	
	@NotBlank(message = "El nombre no puede ser vacío.")
	@Size(min = 5, max = 30, message = "El nombre debe contener al menos 5 y máximo 90 caracteres.")
	private String nombre;

}
