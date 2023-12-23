import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> employes;

    public SocieteArrayList(){
        employes= new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e){
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom){
        for ( Employe e: employes){
            if(e.getNom().equals(nom)) return true ;
        }
        return false ;
    }

    @Override
    public boolean rechercherEmploye(Employe e){
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e){
        employes.remove(e);
    }

    @Override
    public void displayEmploye(){
        for (Employe e :employes){
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId(){
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade(){
        Comparator<Employe> departementComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getEmployeNomDepartement().compareTo(o2.getEmployeNomDepartement());
            }
        };
        Comparator<Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(employes, departementComparator.thenComparing(gradeComparator));
    }
}
