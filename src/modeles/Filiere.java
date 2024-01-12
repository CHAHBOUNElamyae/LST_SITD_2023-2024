package modeles;
import java.util.ArrayList;
public class Filiere{
    private int id;
    private Departement departement;
    private String intitule;
    private Enseignant responsable;
    ArrayList<Module> modules = new ArrayList<Module>();


    public Filiere(){
    }
    public Filiere(Departement departement, String intitule, Enseignant responsable) {
        this.departement = departement;
        this.intitule = intitule;
        this.responsable = responsable;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public Enseignant getResponsable() {
        return responsable;
    }
    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public Departement getDepartement() {
        return departement;
    }
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
}
