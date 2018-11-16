/**
 * 
 */
package Modelo;

/**
 * @author Jose , Bryan
 *
 */
public class Cliente {
	private int cedula;
	private String nombre;
	
	/**Constructor Normal
	/**
	 * @param cedula
	 * @param nombre
	 */
	public Cliente() {
		cedula = 0;
		nombre = "Cliente";
	}

	
	
	
	/** CONSTRUCTOR POR PARAMETROS DE CLASE CLIENTE
	 * @param cedula
	 * @param nombre
	 */
	public Cliente(int cedula, String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
	}


	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cedula del titular: ").append(cedula).append("\r\n");
		sb.append("Nombre del cliente").append(nombre).append("\r\n");
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	/**
	 * @return el cedula
	 */
	public int getCedula() {
		return cedula;
	}




	/**
	 * @param cedula el cedula a establecer
	 */
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}




	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}




	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
