package Services;
import modeles.Enseignant;
import modeles.Filiere;
import modeles.Module;
import java.util.ArrayList;
public class ModuleServices {

    public static Module addModule(String intitule, Enseignant responsable,  Filiere filiere) {
        Module module=new Module();
        module.setIntitule(intitule);
        module.setProfesseur(responsable);
        module.setFiliere(filiere);
        module.setId(DB.getMODId());
        return  new Module();
    }

    public static ArrayList<java.lang.Module> deleteModuleById(int id){
        DB.modules.remove(getModuleById(id));
        return  DB.modules;
    }

    public static int getModuleById(int id) {
        return id;
    }


    public static ArrayList<java.lang.Module> getAllModule(){
        return  DB.modules;
    }
}