package TD3;

public class EX6 {
    public static void main(String[] args) {
        // Test de la classe Disque
        Disque disque1 = new Disque(new Point(2, 3), 5.0, "Disque");
        System.out.println(disque1.toString());
        System.out.println("Périmètre : " + disque1.getPerimeter());
        System.out.println("Aire : " + disque1.getAire());

        Disque disque2 = new Disque();
        System.out.println(disque2.toString());
        System.out.println("Périmètre : " + disque2.getPerimeter());
        System.out.println("Aire : " + disque2.getAire());

        // Test de la classe Rectangle
        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "Rectangle");
        System.out.println(rectangle1.toString());
        System.out.println("Périmètre : " + rectangle1.getPerimeter());
        System.out.println("Aire : " + rectangle1.getAire());

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.toString());
        System.out.println("Périmètre : " + rectangle2.getPerimeter());
        System.out.println("Aire : " + rectangle2.getAire());
    }
}
abstract class Figure {
    protected String nom;
    public Figure() {
        this.nom = "Figure";
    }
    public Figure(String nom) {
        this.nom = nom;
    }
    // Méthode abstraite pour calculer le périmètre de la figure
    public abstract double getPerimeter();
    // Méthode abstraite pour calculer l'aire de la figure
    public abstract double getAire();
    @Override
    public String toString() {
        return "Nom de la figure : " + nom;
    }
}
class Disque extends Figure {
    private Point centre;
    private double rayon;
    // les constructeurs
    public Disque() {
        super("Disque");
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }
    public Disque(Point centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }
    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }
    // les Accesseurs geterses et seterses
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }
    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return super.toString() + ", Centre : " + centre + ", Rayon : " + rayon;
    }
}
class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    // Constructeurs
    public Rectangle() {
        super("Rectangle");
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Accesseurs et mutateurs
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Implémentation des méthodes abstraites de la classe Figure
    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }
    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return super.toString() + ", Longueur : " + longueur + ", Largeur : " + largeur;
    }
}