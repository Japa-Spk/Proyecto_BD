/**
 * 
 */
package Modelo;

/**
 * @author JOSE
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.Producto;

public class FacturaDAO{
	private static Connection cn;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Proyecto_BD", "sa", "123456");
		} catch (Exception e) {
			// TODO: handle exception
			cn=null;
		}
		return cn;
	}
	/**
	 * Aui estan los dos metodos de prueba, toca organizarlos para que muestre en la vista de factura
		Se maneja parecido a la de agregar productos.
	*/
	public void Factura(String b) throws SQLException{
		String a=b;
		Connection pruevaCn=FacturaDAO.getConnection();
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("EXECUTE ObtenerFactura " + a);
			while(rst.next()) {
				System.out.println("Codigo de Factura: " + rst.getInt(1) +"\n Fecha Factura: "+rst.getDate(2)+"\n Cedula Cliente: "+rst.getLong(3)
									+"\n Nombre Cliente: "+rst.getString(4)+"\n Total Factura: "+rst.getInt(5));
			}
		}else {
			System.out.println("Desconectado");
		}
	}
	
	public ArrayList<Producto> Productos() throws SQLException{
		ArrayList<Producto> b = new ArrayList<Producto>();
		Connection pruevaCn=FacturaDAO.getConnection();
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("SELECT * FROM tb_producto");
			while(rst.next()) {
				System.out.println("Codigo de Producto: " + rst.getInt(1) +"\n Nombre Producto: "+rst.getString(2)+"\n Valor Producto: "+rst.getFloat(3)
									+"\n Stock: "+rst.getInt(4));
				Producto a=new Producto(rst.getInt(1), rst.getString(2), rst.getFloat(3), rst.getInt(4));
				b.add(a);
			
			}
		}else {
			System.out.println("Desconectado");
		}
		System.out.println(b.get(2));
		return b;
	}
	
	
}