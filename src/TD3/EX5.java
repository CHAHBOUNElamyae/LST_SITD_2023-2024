package TD3;
public class EX5 {
    public static void main(String[] args) {
    // Création d'un véhicule avec 5 passagers
    Vehicule vehicule = new Vehicule(5);
    // Affichage du nombre de passagers du véhicule
        System.out.println(vehicule.toString());
    // Modification du nombre de passagers à 8
        vehicule.setNbPassager(8);
    // Affichage du nombre de passagers après modification
        System.out.println(vehicule.toString());
        Moto M=new Moto(3);
        M.afficheInfoMoto();
        // Création d'un avion avec 150 passagers et 2 moteurs
        Avion monAvion1 = new Avion(150, 2);
        // Création d'un avion avec 100 passagers (le nombre de moteurs est initialisé à 0 par défaut)
        Avion monAvion2 = new Avion(100);
        // Création d'un avion avec 0 passager et 1 moteur (valeurs par défaut)
        Avion monAvion3 = new Avion();
        // Affichage des informations des avions
        monAvion1.afficheInfoAvion();
        monAvion2.afficheInfoAvion();
        monAvion3.afficheInfoAvion();
}
}
class Vehicule {
    private int nbPassager;
    // Constructeur de la classe Vehicule
    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }
    @Override
    public String toString() {
        return "le nombre de passagers du véhicule est : " + nbPassager;
    }
    public int getNbPassager() {
        return nbPassager;
    }
    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }
}
class Moto extends Vehicule {
    private int nbRoues = 2;
    public Moto(int nbPassager) {
        super(nbPassager);
    }
    public void afficheInfoMoto() {
        System.out.println("Nombre de roues de la moto : " + nbRoues);
    }
}
/*Si la classe Moto ne contient pas de constructeur, le compilateur générera un
constructeur par défaut implicite pour elle. Cependant, si la classe parente (Vehicule dans ce cas)
 ne possède pas de constructeur par défaut et que la classe dérivée ne fournit pas de constructeur
 explicite, le compilateur générera une erreur de compilation.
 */
class Avion extends Vehicule {
    private int nbMoteur;

    public Avion() {
        this(0, 0);
    }
    public Avion(int nbPassager) {
        this(nbPassager, 0);
    }
    public Avion(int nbPassager, int nbMoteur) {
        super(nbPassager);
        this.nbMoteur = nbMoteur;
    }
    public void afficheInfoAvion() {
        System.out.println("Nombre de moteurs de l'avion : " + nbMoteur);
    }
}
class Triporteur extends Moto {
    private int nbPassagersArriere;
    public Triporteur() {
        this(0);
    }
    public Triporteur(int nbPassagersArriere) {
        super(nbPassagersArriere);
        this.nbPassagersArriere = nbPassagersArriere;
    }
    public Triporteur(int nbPassagersArriere, int nbPassagers) {
        // Appelle le constructeur de la classe Moto
        super(nbPassagers);
        this.nbPassagersArriere = nbPassagersArriere;
    }
    public void afficheInfoTriporteur() {
        System.out.println("Nombre de passagers arrière du triporteur : " + nbPassagersArriere);
    }
}
