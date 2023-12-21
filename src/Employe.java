public class Employe implements Comparable<Employe> {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String nomDepartement;
    protected int grade;

    public Employe(){

    }

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade ){
        this.id= id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDepartement=nomDepartement;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object obj){

        if (obj == null) return false ;
        if (this == obj || getClass() != obj.getClass()) return true ;
        if ( obj instanceof Employe employe){
            return getId()==employe.getId() && getNom().equals(employe.getNom()) ;
        }
        return false ;
    }

    @Override
    public String toString(){
        return " Employe {id: "+id+" ,Nom: "+nom+ " ,Prenom: "+prenom+ " ,Nom de departement: "+nomDepartement+" ,grade :"+grade+ "}" ;
    }

    @Override
    public int compareTo( Employe employe){
        return this.id - employe.getId();
    }
}
