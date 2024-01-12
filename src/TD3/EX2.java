package TD3;

public class EX2 {
    public static void main(String[] args){
        PointNom a=new PointNom(2,4, "A");
        a.affCoord();
        a.affCoordNom();
        a.deplace(2,2);
        a.affCoordNom();
    }
}
class PointNom extends Point{
    private String nom;

    // Constructeur de la classe PointNom
    public PointNom(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    // Méthode pour définir les coordonnées et le nom d'un objet de type PointNom
    public void setPointNom(int x, int y, String nom) {
        super.deplace(x - this.getX(), y - this.getY());
        this.nom = nom;
    }

    // Méthode pour définir seulement le nom d'un objet de type PointNom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour afficher les coordonnées et le nom d'un objet de type PointNom
    public void affCoordNom() {
        System.out.println("Coordonnees : " + this.getX() + " " + this.getY() + " Nom : " + this.nom);
    }
}
