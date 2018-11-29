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
		Se maneja parecido a la de agregar productos .
	*/
	public FacturaV Factura(String b) throws SQLException{
		String a=b;
		FacturaV c = null;
		Connection pruevaCn=FacturaDAO.getConnection();
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("EXECUTE ObtenerFactura " + a);
			
			while(rst.next()) {
				System.out.println("Codigo de Factura: " + rst.getInt(1) +"\n Fecha Factura: "+rst.getDate(2)+"\n Cedula Cliente: "+rst.getLong(3)
									+"\n Nombre Cliente: "+rst.getString(4)+"\n Total Factura: "+rst.getInt(5));
			c = new FacturaV(rst.getInt(1), rst.getLong(3), rst.getString(4), rst.getDate(2), rst.getInt(5));
			}
		}else {
			System.out.println("Desconectado");
		}
		
		return c;
	}
	
	
	
	
	public ArrayList<Producto> Productos(String x) throws SQLException{
		ArrayList<Producto> b = new ArrayList<Producto>();
		Connection pruevaCn=FacturaDAO.getConnection();
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("EXECUTE ListarProductos " + x);
			while(rst.next()) {
				System.out.println("Codigo de Producto: " + rst.getInt(1) +"\n Nombre Producto: "+rst.getString(2)+"\n Valor Producto: "+rst.getFloat(3)
									+"\n Stock: "+rst.getInt(4));
				Producto a=new Producto(rst.getInt(1), rst.getString(2), rst.getFloat(3), rst.getInt(4));
				b.add(a);
			
			}
		}else {
			System.out.println("Desconectado");
		}
		
		return b;
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
		
		return b;
	}
	
	

	
	
	
	
	public int PrimeroUltimo(boolean p) throws SQLException{
		int c=0;
		Connection pruevaCn=FacturaDAO.getConnection();
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("SELECT TOP 1 codigo\r\n" + 
					"FROM tb_factura\r\n" + 
					"ORDER BY codigo ASC");
			if(p==true) {
			rst=stm.executeQuery("SELECT TOP 1 codigo\r\n" + 
					"FROM tb_factura\r\n" + 
					"ORDER BY codigo ASC");
			}else {
				rst=stm.executeQuery("SELECT TOP 1 codigo\r\n" + 
						"FROM tb_factura\r\n" + 
						"ORDER BY codigo DESC");
				
			}
			while(rst.next()) {
				System.out.println("NUMERO LLAMADO: " + rst.getInt(1));
			c = rst.getInt(1);
					}
		}else {
			System.out.println("Desconectado");
		}
		
		return c;
	}
	
	
	
	public String Consultas(String b) throws SQLException{
		Connection pruevaCn=FacturaDAO.getConnection();
		String c = null;
		if(pruevaCn!=null) {
			System.out.println("..: CONECTADO :..");
			System.out.println(pruevaCn);
			Statement stm=pruevaCn.createStatement();
			ResultSet rst=stm.executeQuery("EXECUTE Consultas " + b);
			
			while(rst.next()) {
				if(Integer.parseInt(b)==0) {
					c ="Mes:" + rst.getString(1)+"\nVentas:"+rst.getString(2);	
				}if(Integer.parseInt(b)==1) {
					c ="Nombre:" + rst.getString(1)+"\nCodigo Producto:"+rst.getString(2)+"\nTotal:"+rst.getString(3);	
				}if(Integer.parseInt(b)==2) {
					c = "Codigo de factura:"+rst.getString(1)+"\nCedula:"+rst.getString(2)+"\nCliente:"+rst.getString(3)+"\nTotal:"+rst.getString(4);
				}
				
				
					}
		}else {
			System.out.println("Desconectado");
		}
		
		return c;
	}
	
	
	
	
	





}