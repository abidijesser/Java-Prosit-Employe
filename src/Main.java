public class Main {
    public static void main(String[] args) {

        Departement d1=new Departement(01,10, "Info");
        Departement d2=new Departement(02,11, "Physique");
        Departement d3=new Departement(03,12, "Chimie");
        Departement d4=new Departement(04,13, "Math");

        /* System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4); */

        DepartementHashSet departementHashSet=new DepartementHashSet();
        departementHashSet.ajouterDepartement(d1);
        departementHashSet.ajouterDepartement(d2);
        departementHashSet.ajouterDepartement(d3);
        departementHashSet.ajouterDepartement(d4);
        departementHashSet.displayDepartement();

        System.out.println("--------------------------------------------------------------------");

        System.out.println(departementHashSet.trierDepartementById());
        System.out.println(departementHashSet.rechercherDepartement("Info"));
        System.out.println(departementHashSet.rechercherDepartement(d1));

        System.out.println("--------------------------------------------------------------------");

        AffectationHashMap affectationHashMap= new AffectationHashMap() ;
        Employe e1=new Employe(01, "abidi", "jasser", "d1", 5) ;
        Employe e2=new Employe(02, "aloui", "amin", "d2", 4) ;
        affectationHashMap.ajouterEmployeDepartement(e1, d1);
        affectationHashMap.ajouterEmployeDepartement(e2, d2);
        affectationHashMap.afficherEmployesEtDepartements();

        System.out.println("--------------------------------------------------------------------");
        Employe e3=new Employe(03, "belgacem", "raed", "d3", 3) ;
        affectationHashMap.ajouterEmployeDepartement(e3, d3);
        affectationHashMap.afficherEmployes();
        affectationHashMap.afficherDepartements();

        System.out.println(affectationHashMap.trierMap());
    }
}