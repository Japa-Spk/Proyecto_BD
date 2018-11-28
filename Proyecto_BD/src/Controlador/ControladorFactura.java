/**
 * 
 */
package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.FacturaDAO;
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
	public ArrayList<Producto> listarproductos() throws SQLException {
		return new FacturaDAO().Productos();
	}
	
	
}
