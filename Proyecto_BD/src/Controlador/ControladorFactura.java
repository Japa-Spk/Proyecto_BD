/**
 * 
 */
package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.Cliente;
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
	
	public Producto ProductoX(String x) throws SQLException {
		return new FacturaDAO().Producto(x);
	}
	
	
	public void AProducto(String a, String b, String c, String d) throws SQLException {
		new FacturaDAO().AgregarQuitarP(a,b,c,d);
	}
	
	public void EliminarF(String a) throws SQLException {
		new FacturaDAO().EliminarProFac(a);
		new FacturaDAO().EliminarFac(a);
		
	}
	
	public void ActualizarF(String a, String b) throws SQLException {
		new FacturaDAO().ActualizarFac(a,b);
	}
	
	public void GuardarF(String a, String b, String c) throws SQLException {
		new FacturaDAO().GuardarFac(a,b,c);
	}
	
	
	public ArrayList<Cliente> Clientes () throws SQLException{
			
			return new FacturaDAO().Clientes();
		}
	
	
	
	public int primeroUltimate (boolean b) throws SQLException{
		
		return new FacturaDAO().PrimeroUltimo(b);
	}
	
		public String Consult (String b) throws SQLException{
		
		return new FacturaDAO().Consultas(b);
	}
	
	
	
	
	
	
}
