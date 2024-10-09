package classes;

public class Penguin extends Aquatic{
    private float swimmingDepth ;
    public Penguin(String a , String b , int c , boolean d , String e , float s){
        super(a,b,c,d,e);
        this.swimmingDepth = s;
    }
    public String toString(){
        String x = super.toString();
        x += "\nSwimming Depth: " + swimmingDepth;
        return x;
    }
}
