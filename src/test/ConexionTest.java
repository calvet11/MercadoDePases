package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://DESKTOP-G82BJ4K\\SQLEXPRESS;databaseName=master;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";

        
        try (Connection conexion = DriverManager.getConnection(url)) {
            if (conexion != null) {
                System.out.println("✅ Conexión exitosa a SQL Server!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos:");
            e.printStackTrace();
        }
	}

}
