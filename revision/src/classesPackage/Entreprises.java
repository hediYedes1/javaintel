package classesPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Entreprises {
    public List<Prestation> prestations = new ArrayList<Prestation>();

    public void ajouterPrestation(Prestation p) throws PrestationExistExeption {
        boolean cherchez = prestations.stream().anyMatch(prestation -> prestation.equals(p));
        if (cherchez)
            throw new PrestationExistExeption("la Prestation existe");
        else {
            prestations.add(p);
        }
    }
    public void ajouterPrestation1(Prestation p) throws PrestationExistExeption {
        for (Prestation p1 : prestations) {
            if (p1.equals(p)) {
                throw new PrestationExistExeption("la Prestation existe");
            }
            else {
                prestations.add(p);
            }
        }
    }
    

    public void afficherNbrPrestation()
    {
        int x=0 ;
        int y=0;
        for(Prestation p : prestations)
        {
            if(p instanceof Produit)
            {
                x+=1 ;
            }
            else if (p instanceof Service)
            {
                y+=1 ;
            }
        }
        System.out.println("le nombre de Produit est " + x + "le nombre de Service est " + y );
        
        long z = prestations.stream()
                .filter(prestation -> prestation instanceof Service)
                .count();
        long a = prestations.stream()
                .filter(prestation -> prestation instanceof Produit)
                .count();
        System.out.println("z : " +z + "a : " +a);
    }
        public List<Prestation> prestationparClient(String client) {
        return prestations.stream().filter(prestation -> prestation.getNom_client().equals(client)).collect(Collectors.toList());
    }
    public List<Prestation> prestationparClient1(String client)
    {
        List<Prestation> prestations1 = new ArrayList<>();
        for (Prestation p : prestations) {
            if (p.getNom_client().equals(client)) {
                prestations1.add(p);
            }
        }
        return prestations1;
    }
        public Map<String, List<Prestation>> filterParClient()
        {
            return prestations.stream().collect(Collectors.groupingBy(Prestation::getNom_client));
        }
    public Map<String, List<Prestation>> filterParClient1()
    {
        Map<String, List<Prestation>> prestations1 = new HashMap<>();
        for (Prestation p : prestations) {
            String client1 = p.getNom_client();
            prestations1.put(client1,new ArrayList<>());
            prestations1.get(client1).add(p);
        }
        return prestations1;
    }
        public List<String> afficherClient()
        {
            return prestations.stream().map(Prestation::getNom_client).distinct().sorted().collect(Collectors.toList());
        }
    public List<String> afficherClient1()
    {
        List<String> nom= new ArrayList<>();
        for (Prestation p : prestations) {
            String client1 = p.getNom_client();
            if (!nom.contains(client1))
            {

                nom.add(client1);
            }
        }
        nom.sort(String::compareTo);
        return nom;
    }
        public List<String> afficherProjects()
        {
            return prestations.stream().map(Prestation::getNom_projet).distinct().sorted().collect(Collectors.toList());
        }

    public Map<Service, Integer> recupererServices() {
        return prestations.stream()
                .filter(prestation -> prestation instanceof Service) // Filtrer les prestations de type Service
                .map(prestation -> (Service) prestation) // Convertir la prestation en un objet Service
                .collect(Collectors.groupingBy(
                        Function.identity(), // Grouper par service (unicité du service)
                        Collectors.summingInt(service -> service.getPrix_heures() * service.getNombre_heures()) // Calculer le prix total du service
                ));
    }
     public Map<Service, Integer> recupererServices1()
    {
        Map<Service, Integer> servicesPrixTotal = new HashMap<>();
        Function<Service, Integer> fun = e -> e.getPrix_heures() * e.getNombre_heures();
        for (Prestation p : prestations)
        {
            if(p instanceof Service s)
            {
                servicesPrixTotal.put(s,fun.apply(s));
            }
        }
        return servicesPrixTotal;

    }
    public void totalProduits()
    {
        int x = prestations.stream().filter(p -> p instanceof Produit)
                .map(p -> (Produit) p)
                .filter(p ->p.getDate_livraison().equals("2023"))
                .mapToInt(Produit::getPrix_total)
                .sum();
        System.out.println(x);
    }





}

