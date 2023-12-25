import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> departementHashSet;

    public DepartementHashSet(){
        departementHashSet=new HashSet<>();
    }

    @Override
    public void ajouterDepartement( Departement departement){
        departementHashSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom){
        for (Departement d: departementHashSet){
            if (d.getNomDepartement().equals(nom)) return true ;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement){
        return departementHashSet.contains(departement) ;
    }

    @Override
    public void supprimerDepartement(Departement departement){
        departementHashSet.remove(departement);
    }

    @Override
    public void displayDepartement(){
        Iterator<Departement> it= departementHashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        /*TreeSet<Departement> departementTreeSet = new TreeSet<>();
        for (Departement d : departementHashSet) {
            departementTreeSet.add(d);
        }
        return departementTreeSet; */

        return new TreeSet<>(departementHashSet);
    }


}
