package TD2;

public class EX6 {
    public static void main(String[] args){
        Banque BMC=new Banque(1, 5000.75, "AB 1200");
        System.out.println(BMC.toString());
        BMC.AfficheSolde();
        BMC.Diposer(500);
        System.out.println(BMC.toString());
        BMC.AfficheSolde();
        BMC.Retirer(200);
        System.out.println(BMC.toString());
        BMC.AfficheSolde();
    }
}
class Banque{
    private int NumCompte;
    private double solde;
    private String CIN;

    public int getNumCompte() {
        return NumCompte;
    }

    public void setNumCompte(int NumCompte) {
        this.NumCompte = NumCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public Banque(int NumCompte, double solde, String CIN){
        this.NumCompte=NumCompte;
        this.solde=solde;
        this.CIN=CIN;
    }
    public double Diposer(int mony){
        return solde=solde+mony;
    }
    public double Retirer(int mony){
        return solde=solde-mony;
    }

    @Override
    public String toString() {
        return  "le NumCompte est : " + this.NumCompte + " le solde est : " + this.solde + " le CIN est : " + this.CIN ;
    }
    public void AfficheSolde(){
        System.out.println("le solde est : "+this.getSolde()+" DH");
    }
}