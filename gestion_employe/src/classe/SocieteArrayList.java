package classe;

import interfaces.lGestion;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


public class SocieteArrayList implements lGestion<Employe> {
    private ArrayList <Employe> employees;

    @Override
    public void ajouterEmploye(Employe e)  {
        employees.add(e);

    }
    @Override
    public boolean rechercherEmploye(String nom)
    {

        for (Employe e : employees) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe e)
    {
        return (employees.contains(e)) ;


        }

    @Override
    public void supprimerEmploye(Employe e)
    {
        employees.remove(e);
    }

    @Override
    public void displayEmploye()
    {
        for (Employe e : employees) {
            System.out.println(e);
        }
    }
    @Override
    public void trierEmployeParId()
    {
        Collections.sort(employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade()
    {
        employees.sort(Comparator.comparing(Employe :: getNom)
                .thenComparing(Employe :: getNomDeDepartement)
                .thenComparing(Employe::getGrade));
    }
}
