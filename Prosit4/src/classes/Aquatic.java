package classes;

public class Aquatic extends Animal {
    private String habitat ;

    public Aquatic(String a,String b,int c,Boolean d ,String h ) {
        super(a,b,c,d);
        this.habitat = h;

    }
    public String toString(){
        String res=super.toString();
        res+= "\nHabitat: " + habitat;
        return res;
    }
    public void swim()
    {
        System.out.println("Aquatic Swimming");
    }
}
