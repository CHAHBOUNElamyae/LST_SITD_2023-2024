package modeles;
import java.util.ArrayList;
public class Enseignant extends Personne{
    private String grade;
    private Departement departement;
    ArrayList<Module> modules = new ArrayList<Module>();

    public Enseignant(String nom, String prenom, String email, String grade, Departement departement) {
        super(nom, prenom, email);
        this.grade = grade;
        this.departement = departement;
    }
    public Enseignant() {
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

}
