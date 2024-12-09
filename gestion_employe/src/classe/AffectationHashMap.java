package classe;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
public class AffectationHashMap {
    HashMap<Employe,Departement> affectations = new HashMap<>();
    public void ajouterEmployeDepartement(Employe e, Departement d)
    {
        if(!affectations.containsKey(e)){
            System.out.println("deja affecte");
        }else {
        affectations.put(e,d);
        System.out.println("affectation reussit");
    }}
    public void afficherEmployesEtDepartements()
    {
        for (Map.Entry<Employe,Departement> e : affectations.entrySet())
        {
            Employe emp = e.getKey();
            Departement d = e.getValue();
            System.out.println(emp + " " + d);

        }
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("L'employé " + e.getNom() + " a été supprimé du département " + d.getNomDepartement() + ".");
        } else {
            System.out.println("Aucune correspondance trouvée pour l'employé " + e.getNom() + " dans le département " + d.getNomDepartement() + ".");
        }
    }
    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("L'employé " + e.getNom() + " a été supprimé.");
        } else {
            System.out.println("L'employé " + e.getNom() + " n'existe pas.");
        }
    }
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e.getNom());
        }
    }
    public void afficherDepartements() {
        Set<Departement> departements = new HashSet<>(affectations.values());
        System.out.println("Liste des départements :");
        for (Departement d : departements) {
            System.out.println(d.getNomDepartement());
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9 : Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Instruction 10 : Trier la Map par identifiant d'employé
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(Comparator.comparingInt(Employe::getIdentifiant));
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}



