package classes;



import enumm.Food ;
import interfacee.Omnivore ;
public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs ;
    public Terrestrial(String a, String b, int c , boolean d , int nb) throws exep{

        super(a, b, c, d);
        this.nbrLegs = nb;

    }
@Override
    public String toString() {
        String s = super.toString();
        s+= "\nNumber of Legs: " +nbrLegs;
        return s;
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Cet animal terrestre mange à la fois de la viande et des plantes.");
        } else if (food == Food.MEAT) {
            System.out.println("Cet animal terrestre mange de la viande uniquement.");
        } else if (food == Food.PLANT) {
            System.out.println("Cet animal terrestre mange des plantes uniquement.");
        }
    }
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Cet animal terrestre mange des plantes.");
        } else {
            System.out.println("Cet animal terrestre ne mange pas uniquement de la viande.");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Cet animal terrestre mange de la viande.");
        } else {
            System.out.println("Cet animal terrestre ne mange pas uniquement des plantes.");
        }
    }


}
