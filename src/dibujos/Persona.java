package dibujos;

public class Persona{
	private String nombre;
	private int ventas;
	public Persona(String nombre, int ventas) {
		this.nombre=nombre;
		this.ventas=ventas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
}
