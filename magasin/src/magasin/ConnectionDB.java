package magasin;
import java.sql.*;
public class ConnectionDB {
	private static Connection conn = null;
	private ConnectionDB () {};
	public static Connection getConnection() {
		if(conn == null) {
			String connectionUrl = "jdbc:sqlserver://MARIA-GM:1433;" + "databaseName=gestionMagasin;" +
		    "integratedSecurity=true;encrypt=true;trustServerCertificate=true";
			try {
				conn = DriverManager.getConnection(connectionUrl);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connected");
					
		}
		return conn;
	}
}
