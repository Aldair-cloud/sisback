package pe.edu.upeu.sisgrub.entity;

public class Usuario {
	private int idusuario;
	private String nombre;
	private String contraseña;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int idusuario, String nombre, String contraseña) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
