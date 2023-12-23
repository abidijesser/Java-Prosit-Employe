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
    }
}