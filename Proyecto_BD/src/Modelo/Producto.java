/**
 * 
 */
package Modelo;

/**
 * @author JOSE
 *
 */
public class Producto {
	private int codigo;
	private String nombre;
	private int valorUnitario;
	
	
	
	
	public Producto() {
		codigo=0;
		nombre="Producto";
		valorUnitario=0;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	/**CONSTRUCTOR POR PARAMETROS DE LA CLASE PRODUCTO
	 * @param codigo
	 * @param nombre
	 * @param valorUnitario
	 */
	public Producto(int codigo, String nombre, int valorUnitario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
	}



	public String toString() {
			
			StringBuilder sb = new StringBuilder();
			sb.append("Codigo de producto: ").append(codigo).append(", ");
			sb.append("Nombre de producto: ").append(nombre).append(", "); 
			sb.append("Valor Unitario: ").append(valorUnitario).append(", ");
			
			return sb.toString();	
	
	}

	
	
	
	
	
	




	
	
	
	
	
	
	
	

	/**
	 * @return el codigo
	 */
	public int getCodigo() {
		return codigo;
	}










	/**
	 * @param codigo el codigo a establecer
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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










	/**
	 * @return el valorUnitario
	 */
	public int getValorUnitario() {
		return valorUnitario;
	}










	/**
	 * @param valorUnitario el valorUnitario a establecer
	 */
	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
