/**
 * 
 */
package Modelo;

import java.sql.Date;

/**
 * @author JOSE
 *
 */
public class FacturaV {
	private int codigo;
	private long cedulaC;
	private String nombre;
	private Date fecha;
	private double total;
	
	
	/**
	 * CONSTRUCTOR NORMAL 
	 */
	

	public FacturaV() {
		codigo=0;
		cedulaC=0;
		nombre="";
		fecha=new java.sql.Date(fecha.getTime());
		total=0;
		
	}
	
	
	
	/**
	 * CONSTRUCTOR POR PARAMETROS DE CLASE FACTURA
	 * @param codigo
	 * @param cedulaC
	 * @param fecha
	 * @param total
	 */
	public FacturaV(int codigo, long cedulaC,String nombre, Date fecha, double total) {
		super();
		this.codigo = codigo;
		this.cedulaC = cedulaC;
		this.nombre=nombre;
		this.fecha = fecha;
		this.total = total;
	}


	
	
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo de factura: ").append(codigo).append(", ");
		sb.append("Cedula del cliente: ").append(cedulaC).append(", "); 
		sb.append("Nombre del cliente: ").append(nombre).append(", "); 
		sb.append("Fecha:  ").append(fecha).append(", ");
		sb.append("Total:  ").append(total).append(", ");
		
		return sb.toString();	

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
	 * @return el cedulaC
	 */
	public long getCedulaC() {
		return cedulaC;
	}



	/**
	 * @param cedulaC el cedulaC a establecer
	 */
	public void setCedulaC(long cedulaC) {
		this.cedulaC = cedulaC;
	}



	/**
	 * @return el fecha
	 */
	public Date getFecha() {
		return fecha;
	}



	/**
	 * @param fecha el fecha a establecer
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	/**
	 * @return el total
	 */
	public double getTotal() {
		return total;
	}



	/**
	 * @param total el total a establecer
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	
	
	
	
	
	
}
