public class Departement implements Comparable<Departement>{

    protected int departementId, nmbrEmployes;
    protected String nomDepartement;

    public Departement(){}

    public Departement(int departemendId, int nmbrEmployes, String nomDepartement){
        this.departementId=departemendId;
        this.nomDepartement=nomDepartement;
        this.nmbrEmployes=nmbrEmployes;
    }

    public int getDepartementId() {
        return departementId;
    }

    public void setDepartementId(int departementId) {
        this.departementId = departementId;
    }

    public int getNmbrEmployes() {
        return nmbrEmployes;
    }

    public void setNmbrEmployes(int nmbrEmployes) {
        this.nmbrEmployes = nmbrEmployes;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false ;
        if(obj instanceof Departement departement){
            return getDepartementId()==departement.getDepartementId() && getNomDepartement().equals(departement.getNomDepartement());
        }
        return false ;
    }

    @Override
    public String toString(){
        return " Departement { id= "+departementId+" , nom de dertement= "+nomDepartement+" , nombre des employées= "+nmbrEmployes+ " }" ;
    }

    @Override
    public int compareTo( Departement departement){
        return this.getDepartementId() - departement.getDepartementId() ;
    }
}
