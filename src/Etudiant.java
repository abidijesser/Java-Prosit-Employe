public class Etudiant {

    protected int etudiantId, etudiantAge;
    protected String etudiantNom;

    public Etudiant(){}

    public Etudiant(int etudiantAge, int etudiantId, String etudiantNom){
        this.etudiantAge=etudiantAge;
        this.etudiantId=etudiantId;
        this.etudiantNom=etudiantNom;
    }

    public int getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(int etudiantId) {
        this.etudiantId = etudiantId;
    }

    public int getEtudiantAge() {
        return etudiantAge;
    }

    public void setEtudiantAge(int etudiantAge) {
        this.etudiantAge = etudiantAge;
    }

    public String getEtudiantNom() {
        return etudiantNom;
    }

    public void setEtudiantNom(String etudiantNom) {
        this.etudiantNom = etudiantNom;
    }

    @Override
    public String toString(){
        return "Etudiant { Id= "+etudiantId+ " ,Nom= " +etudiantNom+" , Age= "+etudiantAge+" }" ;
    }
}
