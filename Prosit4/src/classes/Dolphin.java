package classes;

public class Dolphin extends Aquatic{
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
}
