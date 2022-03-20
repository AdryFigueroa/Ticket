package Ticket;

public class Producto {
	private int id;
	private String nombre;
	private String tipo;
	
	public Producto() {
		
	}
	
	public Producto(int id,String nombre, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo; // tipo de producto hogar  movil
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
