/**
 * 
 */
package Modelo;

import java.sql.Date;

/**
 * @author JOSE
 *
 */
public class Factura {
	private int codigo;
	private int cedulaC;
	private Date fecha;
	private double total;
	
	
	/**
	 * CONSTRUCTOR NORMAL 
	 */
	

	public Factura() {
		codigo=0;
		cedulaC=0;
		fecha=new java.sql.Date(fecha.getTime());
		
		
	}
	
	
	
	/**
	 * CONSTRUCTOR POR PARAMETROS DE CLASE FACTURA
	 * @param codigo
	 * @param cedulaC
	 * @param fecha
	 * @param total
	 */
	public Factura(int codigo, int cedulaC, Date fecha, double total) {
		super();
		this.codigo = codigo;
		this.cedulaC = cedulaC;
		this.fecha = fecha;
		this.total = total;
	}


	
	
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo de factura: ").append(codigo).append(", ");
		sb.append("Nombre del cliente: ").append(cedulaC).append(", "); 
		sb.append("Fecha:  ").append(fecha).append(", ");
		sb.append("Total:  ").append(total).append(", ");
		
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
	 * @return el cedulaC
	 */
	public int getCedulaC() {
		return cedulaC;
	}



	/**
	 * @param cedulaC el cedulaC a establecer
	 */
	public void setCedulaC(int cedulaC) {
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
