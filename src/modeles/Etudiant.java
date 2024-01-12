package modeles;
import java.util.ArrayList;
public class Etudiant extends Personne{
    private int apogee;
    private Filiere  filiere;
    ArrayList<Note> notes = new ArrayList<Note>();
    public Etudiant() {

    }
    public Etudiant(String nom, String prenom, String email, int apogee, Filiere filiere) {
        super(nom, prenom, email);
        this.apogee = apogee;
        this.filiere = filiere;
    }

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
}
