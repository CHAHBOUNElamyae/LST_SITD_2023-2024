package TD2;

public class EX3 {
    public static void main(String[] args){
    Livre livre=new Livre("le dernier jour d'un condanee","victor hugo",90.8,2023);
        System.out.println(livre.toString());
    }
}
 class Livre{
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Livre(String titre){
        this.titre=titre;
    }
    public Livre(String Titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
    }
    public Livre(String titre,String auteur,double prix){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    public Livre(String titre,String auteur,double prix,int annee){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        this.annee=annee;
    }
    Livre(Livre lv){

        this(lv.getTitre(), lv.getAuteur(),lv.getPrix(), lv.getAnnee());
    }
    @Override
    public String toString() {
        return "Livre{" + "titre='" + titre + '\'' + ", auteur='" + auteur + '\'' +
                ", prix=" + prix + ", annee=" + annee + '}';
    }
}