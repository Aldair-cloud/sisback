package pe.edu.upeu.sisgrub.daoImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sisgrub.dao.UsuarioDao;
import pe.edu.upeu.sisgrub.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Usuario usuario) {
		String sql = "INSERT INTO usuario (nombre,contraseña) VALUES (?,?)";
		return jdbcTemplate.update(sql, new Object[] {usuario.getNombre(),usuario.getContraseña()});
	}

}
