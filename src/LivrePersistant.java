import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class LivrePersistant {

	public void enregister(Livre livre) {
		String insertSql = "INSERT INTO LIVRE(AUTEUR, TITRE, NB_PAGE) VALUES "
				+ "('"+livre.getAuteur()+"', '" + livre.getTitre() + "', '" + livre.getNbPage() + "');";

		ResultSet resultSet = null;

		try (Connection connection = Connexion.connect();
				PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql,
						Statement.RETURN_GENERATED_KEYS);) {

			prepsInsertProduct.execute();
			// Retrieve the generated key from the insert.
			resultSet = prepsInsertProduct.getGeneratedKeys();

			// Print the ID of the inserted row.
			while (resultSet.next()) {
				System.out.println("Livre enregistré avec l'ID : " + resultSet.getString(1));
			}
		}
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
