package Services;

import modeles.Departement;
import modeles.Enseignant;
import modeles.Filiere;
import java.util.ArrayList;
import Lst_tpjava.Main;
import java.util.ArrayList;

public class FiliereServices {

    public static Filiere addFiliere(String intitule, Enseignant chef, Departement dept) {
        Filiere filiere = new Filiere();
        filiere.setIntitule(intitule);
        filiere.setResponsable(chef);
        filiere.setDepartement(dept);
        filiere.setId(DB.getFILId());
        return  new Filiere();
    }
    public static Filiere updateFiliere(int id , String intitule, Enseignant chef, Departement dept){
        for (Filiere filiere : DB.filieres) {
            if (filiere.getId() == id) {
                filiere.setIntitule(intitule);
                filiere.setResponsable(chef);
                filiere.setDepartement( dept);
            }
            return filiere;
        }
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){

        DB.filieres.remove(getFiliereById(id));
        return  DB.filieres;
    }

    public static Filiere getFiliereById(int id){
        for (Filiere filiere : DB.filieres) {
            if (filiere.getId() == id)
                return  filiere;
        }
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){


        return  DB.filieres;
    }
}