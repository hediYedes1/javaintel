package classes;

import interfacee.Carnivore;
import enumm.Food;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic(String a, String b, int c, Boolean d, String h) throws exep {
        super(a, b, c, d);
        this.habitat = h;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "\nHabitat: " + habitat;
        return res;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Aquatic) {
            Aquatic a = (Aquatic) obj;
            return this.habitat.equals(a.habitat);
        }
        return false;
    }

    // Implémentation de la méthode eatMeat
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("Cet animal aquatique mange de la viande.");
        } else {
            System.out.println("Cet animal aquatique ne mange pas de plantes uniquement.");
        }
    }
}
