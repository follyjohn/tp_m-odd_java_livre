import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	public static Connection connect() {
		String connectionUrl =
               "jdbc:sqlserver://yourserver.database.windows.net:1433;"
                        + "database=AdventureWorks;"
                        + "user=yourusername@yourserver;"
                        + "password=yourpassword;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Connected to the MS SQL Server successfully.");
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		// Finally
		return conn;

	}
}
