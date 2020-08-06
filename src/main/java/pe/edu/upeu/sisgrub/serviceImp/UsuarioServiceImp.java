package pe.edu.upeu.sisgrub.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sisgrub.dao.UsuarioDao;
import pe.edu.upeu.sisgrub.entity.Usuario;
import pe.edu.upeu.sisgrub.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDao;
	@Override
	public int create(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.create(usuario);
	}

}
