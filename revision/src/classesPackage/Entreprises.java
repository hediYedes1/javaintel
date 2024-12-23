package classesPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Entreprises {
    public List<Prestation> prestations = new ArrayList<Prestation>();
    public void ajouterPrestation(Prestation p) throws PrestationExistExeption
    {
       boolean chercher = prestations.stream().anyMatch(prestation -> prestation.equals(p));
       if (chercher)
           throw new PrestationExistExeption("la Prestation existe");
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
        List<Prestation> p = prestations.stream().filter(prestation -> prestation.getNom_client().equals(client)).collect(Collectors.toList());
        return p;
    }
        Map<String, List<Prestation>> filterParClient()
        {
            Map<String, List<Prestation>> p = prestations.stream().collect(Collectors.groupingBy(Prestation::getNom_client));
            return p;
        }

}
