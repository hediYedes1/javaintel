package classe;

import interfaces.IDepartement;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> dep = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement de) {
        dep.add(de);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : dep) {
            if (d.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement de) {
        return dep.contains(de);
    }

    @Override
    public void supprimerDepartement(Departement de) {
        dep.remove(de);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : dep) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>(dep);
        return sortedSet;
    }
}
