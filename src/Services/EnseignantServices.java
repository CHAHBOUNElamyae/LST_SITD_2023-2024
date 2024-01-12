package Services;

import modeles.Departement;
import modeles.Enseignant;
import java.util.ArrayList;
public class EnseignantServices {
    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement departement) {
        Enseignant enseignant = new Enseignant();
        enseignant.setNom(nom);
        enseignant.setPrenom(prenom);
        enseignant.setGrade(grade);
        enseignant.setEmail(email);
        enseignant.setDepartement(departement);
        return  new Enseignant();

    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement departement, ArrayList<Module> module) {
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                enseignant.setPrenom(prenom);
                enseignant.setGrade(grade);
                enseignant.setEmail(email);
                enseignant.setDepartement(departement);
            }
            return enseignant;
        }
        return new Enseignant();
    }

    public static Enseignant getEnsbyid(int id) {
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) {
                return enseignant;
            }
        }
        return new Enseignant();
    }

    public static ArrayList<Enseignant> deleteEnsbyid(int id) {
        DB.enseignants.remove(getEnsbyid(id));
        return DB.enseignants;
    }
    public static ArrayList<Enseignant> getAllEns(){
        return DB.enseignants;
    }
}