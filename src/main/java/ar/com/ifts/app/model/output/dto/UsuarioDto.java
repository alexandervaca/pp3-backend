package ar.com.ifts.app.model.output.dto;

import ar.com.ifts.app.model.Categoria;
import ar.com.ifts.app.model.Permiso;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
	private String id;
	private String nombre;
	private String mail;
	private Categoria categoria;
	private Permiso permiso;
	private boolean habilitado;

}
