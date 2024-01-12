package Controllers;
import Lst_tpjava.Main;
import Services.DB;
import Services.DepartementServices;
import Services.EnseignantServices;
import Services.FiliereServices;
import modeles.Departement;
import modeles.Filiere;
import java.util.ArrayList;
 public class DepartementsController {
    public static void showMenu(){
        System.out.println("***********************[ Départements ]***********************");

        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createDepartement();
                break;
            case 2:
                schowDepartement();
                break;
            case 3:
                editDepartement();
                break;
            case 4:
                destroyDepartement();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
  public static void schowDepartement(){
        for (Departement departement : DB.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (! Main.isNull(departement.getResponsable())) {
                System.out.print(" | Responsable : " + departement.getResponsable().getNom() + " " + departement.getResponsable().getPrenom());
            }
            System.out.println(" ");
        }
    }
    public static void creatDepartement(){
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignantsController.showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        FilieresController.showFilieres();
        int idid = Main.getIntInput("Sélecionnez une filiere par id :");
        DepartementServices.addDept(intitule,EnseignantServices.getEnsbyid(id));
        schowDepartement();
        showMenu();


    }
   public void showDepartements(){
        for (Departement departement : DB.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (! Main.isNull(departement.getResponsable())) {
                System.out.print(" | Responsable : " + departement.getResponsable().getNom() + " " + departement.getResponsable().getPrenom());
            }

            System.out.println("");
        }

    }
    public static void createDepartement() {
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignantsController.showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");

        System.out.println("");
        ArrayList<Filiere> filiere = null;
        filiere = new ArrayList<>();
        boolean continuer = true;
        do{
            FilieresController.showFilieres();
            int idid = Main.getIntInput("Sélecionnez une filiere par id :");
            filiere.add(FiliereServices.getFiliereById(idid));
            String reponse = Main.getStringInput("Voulez-vous ajouter une autre filière 'y'? ");

            // Mettre fin à la boucle si la réponse n'est pas "Y" ou "y"
            continuer = reponse.equalsIgnoreCase("Y");
        }  while (continuer);
        DepartementServices.addDept(intitule ,EnseignantServices.getEnsbyid(id));
        schowDepartement();
        showMenu();
    }

    public static void editDepartement(){
        schowDepartement();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignantsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");

        System.out.println("");
        ArrayList<Filiere> filiere = null;
        filiere = new ArrayList<>();
        boolean continuer = true;
        do{
            FilieresController.showFilieres();
            int idid = Main.getIntInput("Sélecionnez un filier par id :");
            filiere.add(FiliereServices.getFiliereById(idid));
            String reponse = Main.getStringInput("Voulez-vous ajouter une autre filière 'y'  ?");

            // Mettre fin à la boucle si la réponse n'est pas "Y" ou "y"
            continuer = reponse.equalsIgnoreCase("Y");
        }  while (continuer);

        DepartementServices.updateDept(id, intitule ,EnseignantServices.getEnsbyid(idEns));

        schowDepartement();
        showMenu();
    }
    public static void destroyDepartement(){
        schowDepartement();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        DepartementServices.deleteDeptById(id);
        schowDepartement();
    }
}

