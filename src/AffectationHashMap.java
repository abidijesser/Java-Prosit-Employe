import java.util.*;

public class AffectationHashMap {

    Map<Employe, Departement> affectatoinHashMap ;

    public AffectationHashMap() {
        affectatoinHashMap=new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        if (!affectatoinHashMap.containsKey(e)){
            affectatoinHashMap.put(e, d);}
        else{
            System.out.println("un employé ne peut être affecté qu’à un seul département.");
        }
    }

    public void afficherEmployesEtDepartements(){
        Set<Map.Entry<Employe, Departement>> displaySet=affectatoinHashMap.entrySet();
        for (Map.Entry<Employe, Departement> ed:displaySet){
            System.out.println("Keys: "+ed.getKey()+ ", Values: "+ed.getValue());
        }
    }

    public void supprimerEmploye (Employe e){
        affectatoinHashMap.remove(e);
    }

    void supprimerEmployeEtDepartement (Employe e, Departement d){
        affectatoinHashMap.remove(e,d);
    }

    void afficherEmployes(){
        Set<Employe> employes=affectatoinHashMap.keySet();

        /*Iterator<Employe> it=employes.iterator();
        while(it.hasNext()){
            System.out.println("Employe: "+it.next());
        }*/

        for(Employe e :employes){
            System.out.println("Employe: "+e);
        }
    }

    void afficherDepartements(){
        Collection<Departement> departements=affectatoinHashMap.values();
        Iterator<Departement> it=departements.iterator();
        while(it.hasNext()){
            System.out.println("Departements: "+it.next());
        }
    }

     boolean rechercherEmploye (Employe e) {
        return affectatoinHashMap.containsKey(e);
    }

    boolean rechercherDepartement (Departement d){
        return affectatoinHashMap.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap(){
        return new TreeMap<>(affectatoinHashMap);
    }

}
