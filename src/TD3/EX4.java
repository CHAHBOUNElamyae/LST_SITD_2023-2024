package TD3;

public class EX4 {
    public static void main(String[] args){
    Maison M=new Maison("123r",6);
        System.out.println(M.toString());
        Immeuble I=new Immeuble("123r",90);
        System.out.println(I.toString());
    }
}
class Batiment{
    private String Adress;
    public Batiment(){

    }
    public Batiment(String Adress){
        this.Adress=Adress;
    }
    public void setAdress(String Adress){
        this.Adress=Adress;
    }
    public String getAdress(){
        return getAdress();
    }
    @Override
    public String toString(){
        return "le batiment se trouve a : "+this.Adress;
    }
}
class Maison extends Batiment{
    private int nbChambre;
    public Maison(String Adress,int nbChambre){
        super(Adress);
        this.nbChambre=nbChambre;
    }
    public Maison(){

    }

    public int getNbChambre() {
        return this.nbChambre;
    }

    public void setNbChambre(int nbChambre) {
        this.nbChambre = nbChambre;
    }

    @Override
    public String toString() {
        return " la Maison contient " + this.nbChambre +" chambres";
    }
}
class  Immeuble extends Batiment{
    private int nbAppart;
    public Immeuble(String Adress,int nbAppart){
        super(Adress);
        this.nbAppart=nbAppart;
    }
    public Immeuble(){

    }
    public int getNbAppart() {
        return this.nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "l'Immeuble contient " + nbAppart +" Appartements";
    }
}