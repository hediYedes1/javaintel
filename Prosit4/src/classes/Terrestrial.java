package classes;

public class Terrestrial extends Animal {
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
}
