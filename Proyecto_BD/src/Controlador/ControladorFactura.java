/**
 * 
 */
package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.FacturaDAO;
import Modelo.FacturaV;
import Modelo.Producto;
/**
 * @author JOSE
 *
 */
public class ControladorFactura {
	public ControladorFactura() {
		
	}
	/**
	 * Este es el controlador que llama al metodo productos de la clase FACTURADAO
	*/
	
	
	public FacturaV factura(String b) throws SQLException {
		return new FacturaDAO().Factura(b);
	}
	
	
	public ArrayList<Producto> listarproductos(String b) throws SQLException {
		return new FacturaDAO().Productos(b);
	}
	
	public ArrayList<Producto> listarproductos() throws SQLException {
		return new FacturaDAO().Productos();
	}
	
	
}
