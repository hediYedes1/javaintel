package classe;

public class Employe implements Comparable<Employe> {

    private int identifiant ;
    private String nom ;
    private String prenom ;
    private String nomDeDepartement ;
    private int grade ;

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDeDepartement(String nomDeDepartement) {
        this.nomDeDepartement = nomDeDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDeDepartement() {
        return nomDeDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }



    public Employe(int identifiant, String nom, String prenom, String nomDeDepartement, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDeDepartement = nomDeDepartement;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "l'id :"  +identifiant +" nom : " + nom + "prenom : " +prenom +"nom de departement :" +nomDeDepartement +"grade :" +grade ;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Employe) {
            Employe emp = (Employe) obj;

            return (this.identifiant == emp.getIdentifiant() && this.nom.equals(emp.getNom()));
        }
         return false;
        }

    @Override
    public int compareTo(Employe o) {
        return Integer.compare(this.getIdentifiant(), o.getIdentifiant());
    }



}
