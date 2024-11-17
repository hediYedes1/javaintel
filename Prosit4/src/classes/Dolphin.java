package classes;
import enumm.Food ;
import interfacee.Omnivore ;
import interfacee.Carnivore ;
import interfacee.Herbivore;
public class Dolphin extends Aquatic implements Herbivore<Food>{
    private float swimmingSpeed ;
    public Dolphin(String a , String b , int c , boolean d , String e , int f , float s) throws exep{
        super(a,b,c,d,e);
        this.swimmingSpeed = s;
    }


    public String toString() {
         String a = super.toString();
         a += "/nSwimming Speed :" + swimmingSpeed;
         return a;
    }

    @Override
    public void swim(){

        System.out.println("Dolphin swimming");
    }

    @Override
    public void eatPlant(Food plant)
    {
        if (plant==Food.PLANT)
        {
            System.out.println("Dolphin eaten plant");
        }
        else {
            System.out.println("Dolphin eaten non-plant");
        }
    }
}
