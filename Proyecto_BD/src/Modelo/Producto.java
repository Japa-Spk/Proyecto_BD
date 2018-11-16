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
	private double valorUnitario;
	private int stock;
	
	
	
	public Producto() {
		codigo=0;
		nombre="Producto";
		valorUnitario=0;
		stock=0;
		
	}
	
	
	
	
	
	
	
	
	
	
	/**CONSTRUCTOR POR PARAMETROS DE LA CLASE PRODUCTO
	 * @param codigo
	 * @param nombre
	 * @param valorUnitario
	 */
	public Producto(int codigo, String nombre, double valorUnitario, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.stock=stock;
	}



	public String toString() {
			
			StringBuilder sb = new StringBuilder();
			sb.append("Codigo de producto: ").append(codigo).append(", ");
			sb.append("Nombre de producto: ").append(nombre).append(", "); 
			sb.append("Valor Unitario: ").append(valorUnitario).append(", ");
			sb.append("Stock: ").append(stock).append(", ");
			
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
	public double getValorUnitario() {
		return valorUnitario;
	}







	/**
	 * @param valorUnitario el valorUnitario a establecer
	 */
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}







	/**
	 * @return el stock
	 */
	public int getStock() {
		return stock;
	}






	/**
	 * @param stock el stock a establecer
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}





}
