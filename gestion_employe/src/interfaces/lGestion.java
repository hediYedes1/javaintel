package interfaces;

public interface lGestion<T>{
     void ajouterEmploye(T t);
     boolean rechercherEmploye(String nom);
     boolean rechercherEmploye(T t);
     void supprimerEmploye(T t);
     void displayEmploye();
     void trierEmployeParId(); //Comparable
     void trierEmployeParNomDepartementEtGrade(); //Comparator
}
