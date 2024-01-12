package pp;
import Services.DB;
import modeles.Enseignant;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void createTableEns(Connection cx) throws SQLException {
        String req1 = "CREATE TABLE IF NOT EXISTS Enseignant (\n" +
                "idens INT AUTO_INCREMENT PRIMARY KEY, \n" +
                "nom VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "prenom VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "email VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "grade VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                "departement INT, \n" +
                "FOREIGN KEY (departement) REFERENCES Departement(iddep)\n" +
                ");";
        try (Statement smt = cx.createStatement()) {
            smt.executeUpdate(req1);
            System.out.println("Un nouveau tableau 'enseignant' a été créé avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertEns(Enseignant enseignant, Connection cx) throws SQLException {
        String query = "INSERT INTO Enseignant (idens,nom,prenom,email,grade,departement) values (?,?,?,?,?,?)";

        PreparedStatement ps = cx.prepareStatement(query);

        ps.setInt(1, DB.getDeptId());
        ps.setString(2, enseignant.getNom());
        ps.setString(3, enseignant.getPrenom());
        ps.setString(4, enseignant.getEmail());
        ps.setString(5, enseignant.getGrade());
        ps.setString(6, enseignant.getDepartement().getIntitule());
        ps.executeUpdate(query);
    }

    public static void deleteEns(int id, Connection cx) throws SQLException {
        String query = "DELETE  from Enseignant where id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Dpt";
        String user = "root";
        String pwd = "";
        try {
            Connection cx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Good Connection");
            createTableEns(cx);
        } catch (SQLException e) {
            System.out.println("Bad Connection");
            e.printStackTrace();
    }

    }
}