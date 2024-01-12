package TD3;

public class EX3 {
    public static void main(String[] args){
        Centre centre = new Centre(3, 5, "A");
        // Affichage des coordonnées et du nom
        System.out.println("le Centre :");
        centre.affiche();
        // Création d'un objet Cercle
        Cercle cercle = new Cercle(1, 2, "B", 4.5);
        // Affichage des coordonnées, le nom et le rayon d'un cercle
        System.out.println("le Cercle :");
        cercle.afficheCercle();
    }
}
class Centre extends Point {
    private String nom;

    // Constructeur de la classe Centre
    public Centre(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    // Méthode pour afficher le nom
    public void affNom() {
        System.out.println("Nom : " + this.nom);
    }

    // Méthode pour afficher les coordonnées et le nom
    public void affiche() {
        super.affCoord();
        affNom();
    }
}

class Cercle extends Centre {
    private double rayon;

    // Constructeur de la classe Cercle
    public Cercle(int x, int y, String nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    // Méthode pour afficher les coordonnées, le nom et le rayon
    public void afficheCercle() {
        affiche();
        System.out.println("Rayon : " + rayon);
    }
}