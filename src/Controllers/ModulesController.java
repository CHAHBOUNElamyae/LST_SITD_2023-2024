package Controllers;
import Services.*;
import modeles.Enseignant;
import modeles.Filiere;
import  modeles.Module;
import Lst_tpjava.Main;
public class ModulesController {
    public static void showMenu(){
        System.out.println("***********************[ Modules ]***********************");
        System.out.println("1: Pour ajouter un Module");
        System.out.println("2: Pour afficher les Modules");
        System.out.println("3: Pour modifier un Module");
        System.out.println("4: Pour supprimer un Module");
        System.out.println("0: Pour retourner au menu principal");
        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createModule();
                break;
            case 2:
                showModules();
                break;
            /*case 3:
                editModule();
                break;*/
            case 4:
                destroyModule();
                break;
            default:
                Main.showPrincipalMenu();
        }

    }
    public static void showModules() {
        System.out.println("*****************[ Modules ]**********************");
        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                destroyModule();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void createModule(){

        String intitule = Main.getStringInput("Entrez l'intitulé :");
        FilieresController.showFilieres();
        int id = Main.getIntInput("Sélecionnez une filiere  par id :");
        EnseignantsController.showEnseignants();
        int idid = Main.getIntInput("Sélecionnez un professeur par id :");
        ModuleServices.addModule(intitule,EnseignantServices.getEnsbyid(idid),FiliereServices.getFiliereById(id));

        showModules();


    }
    void editModule() {

        int id = Main.getIntInput("Sélectionnez un module par ID :");
        String nom = Main.getStringInput("Entrez le nouveau nom :");

        Enseignant prof = EnseignantServices.getEnsbyid(Integer.parseInt("Entrez le nouvel ID de l'enseignant (laissez vide si aucun) :"));
        Filiere filiere = FiliereServices.getFiliereById(Integer.parseInt("Entrez le nouvel ID de la filière (laissez vide si aucun) :"));




        showMenu();
    }
    public static void destroyModule(){
        showModules();
        int id = Main.getIntInput("Sélecionnez un Module par id :");
        ModuleServices.deleteModuleById(id);
        showModules();
    }
}