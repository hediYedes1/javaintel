package classes;

public abstract class Aquatic extends Animal {
    private String habitat ;

    public Aquatic(String a,String b,int c,Boolean d ,String h ) throws exep{
        super(a,b,c,d);
        this.habitat = h;

    }

    @Override
    public String toString(){
        String res=super.toString();
        res+= "\nHabitat: " + habitat;
        return res;
    }

    public abstract void swim();


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if((obj instanceof Aquatic)) {

        Aquatic a = (Aquatic)obj;
        if(a.habitat == (this.habitat)) {
            return true;
        }


        }
        return false;
        }

    /*
    public boolean equals(Object obj) {


        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }
    */


}
