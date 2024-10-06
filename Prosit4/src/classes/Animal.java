package classes;

public class Animal {
    /*
    public String family;
    public String name;
    public int age;
    public boolean isMammal;
*/
    private String family;
    private String name;
    private int age;
    private boolean isMammal ;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
    }
    public int SetAge(int age) {
        if(age < 0) {
            return -1 ;
        }
        else {
            this.age = age;
        }
        return age ;
    }

    public String toString() {
        return "\nFamily: " + this.family + "\nName: " + this.name + "\nAge: " + this.age + "\nIs Mammal: " + this.isMammal;
    }
}