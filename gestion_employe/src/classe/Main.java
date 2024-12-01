//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package classe ;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();
        SocieteArrayList gestionSocietes = new SocieteArrayList();

        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources Humaines", 8);
        Departement dep3 = new Departement(3, "Marketing", 12);


        Employe emp1 = new Employe(1,"hedi","yedes" ,"xxx", 10);
        Employe emp2 = new Employe(2,"hamza","farhani","d",19);
        Employe emp3 = new Employe(3,"ghi","hmid","e",20);


        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);


        gestionSocietes.ajouterEmploye(emp1);
        gestionSocietes.ajouterEmploye(emp2);
        gestionSocietes.ajouterEmploye(emp3);


        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();


        System.out.println("Liste des Employes :");
        gestionSocietes.displayEmploye();


        System.out.println("\nRechercher 'Marketing' : " + gestionDepartements.rechercherDepartement("Marketing"));


        System.out.println("\nRechercher 'Marketing' : " + gestionSocietes.rechercherEmploye("hedi"));

        System.out.println("\nDépartements triés par ID :");
        TreeSet<Departement> sortedDeps = gestionDepartements.trierDepartementById();
        for (Departement d : sortedDeps) {
            System.out.println(d);
        }
        gestionDepartements.supprimerDepartement(dep1);
        gestionDepartements.rechercherDepartement(dep2);
        gestionDepartements.displayDepartement();

        gestionSocietes.rechercherEmploye(emp1);
        gestionSocietes.supprimerEmploye(emp2);
        gestionSocietes.trierEmployeParId();
        gestionSocietes.trierEmployeParNomDepartementEtGrade();
    }




}
