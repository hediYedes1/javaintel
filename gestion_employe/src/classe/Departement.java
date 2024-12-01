package classe;


public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nbEmploye;

    public Departement(int id, String nomDepartement, int nbEmploye) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmploye = nbEmploye;
    }

    public int getId() {
        return id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Departement)) return false;

        Departement dep = (Departement) obj;
        return this.id == dep.getId() && this.nomDepartement.equals(dep.getNomDepartement());
    }

    @Override
    public int compareTo(Departement d) {
        return Integer.compare(this.id, d.id);
    }

    @Override
    public String toString() {
        return "Departement { " +
                "id = " + id +
                ", nomDepartement = '" + nomDepartement + '\'' +
                ", nbEmploye = " + nbEmploye +
                " }";
    }
}

