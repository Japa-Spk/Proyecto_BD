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
	public static void main(String[] args) throws SQLException{
		Connection pruevaCn=FacturaDAO.getConnection();
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("EXECUTE ObtenerFactura 6");
			while(rst.next()) {
				System.out.println("Codigo de Factura: " + rst.getInt(1) +"\n Fecha Factura: "+rst.getDate(2)+"\n Cedula Cliente: "+rst.getLong(3)
									+"\n Nombre Cliente: "+rst.getString(4)+"\n Total Factura: "+rst.getInt(5));
			}
		}else {
			System.out.println("Desconectado");
		}
	}
	
	
}