package classes;

public class Penguin extends Aquatic{

    private float swimmingDepth ;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }


    public Penguin(String a , String b , int c , boolean d , String e , float s) throws exep{
        super(a,b,c,d,e);
        this.swimmingDepth = s;
    }
    @Override
    public String toString(){
        String x = super.toString();
        x += "\nSwimming Depth: " + swimmingDepth;
        return x;
    }

    @Override
    public void swim()
    {
        System.out.println("Swimming penguin ");
    }
}
