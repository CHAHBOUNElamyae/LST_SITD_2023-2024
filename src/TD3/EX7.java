package TD3;

public class EX7 {
    public static void main(String[] args){
        Patron patron1 = new Patron("Chahboune", "lamyae", 5000.0);
        System.out.println(patron1.toString());
        System.out.println("Salaire du patron: " + patron1.gains());

        TravailleurCommission travailleur1 = new TravailleurCommission("mohammed", "Abbassi", 2000.0, 5.0);
        travailleur1.setQuantite(50);
        System.out.println(travailleur1.toString());
        System.out.println("Salaire du travailleur à la commission: " + travailleur1.gains());

        TravailleurHoraire travailleur2 = new TravailleurHoraire("Saad", "darkaui", 20.0);
        travailleur2.setHeures(160);
        System.out.println(travailleur2.toString());
        System.out.println("Salaire du travailleur horaire: " + travailleur2.gains());
    }
}
abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe() {
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Accesseurs et mutateurs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode abstraite à implémenter dans les classes dérivées
    public abstract double gains();

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
    }
}

class Patron extends Employe {
    private double salaire;

    public Patron() {
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    // Accesseurs et mutateurs
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patron [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
    }
}

class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    // Accesseurs et mutateurs
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }

    @Override
    public String toString() {
        return "TravailleurCommission [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire
                + ", commission=" + commission + ", quantite=" + quantite + "]";
    }
}

class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    // Accesseurs et mutateurs
    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire [nom=" + nom + ", prenom=" + prenom + ", retribution=" + retribution
                + ", heures=" + heures + "]";
    }
}