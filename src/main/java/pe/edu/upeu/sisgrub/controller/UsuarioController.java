package pe.edu.upeu.sisgrub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sisgrub.entity.Usuario;
import pe.edu.upeu.sisgrub.service.UsuarioService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/create")
	public int save(@RequestBody Usuario usuario) {
		return usuarioService.create(usuario);
	}
}
