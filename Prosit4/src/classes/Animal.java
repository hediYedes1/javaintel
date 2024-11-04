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

    public int getAge() {
        return age;
    }

    private int age;
    private boolean isMammal ;

    public Animal(String family, String name, int age, boolean isMammal) throws exep{
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
        if (age < 0)
        {
            throw new exep("invalid age");
        }
        this.age = age;

    }



    public String getName() {
        return name;
    }

    public void SetAge(int age) {
        if(age < 0) {
            System.out.println("Invalid age provided. Age cannot be negative.");
        }
        else {
            this.age = age;
        }

    }


@Override
    public String toString() {
        return "\nFamily: " + this.family + "\nName: " + this.name + "\nAge: " + this.age + "\nIs Mammal: " + this.isMammal;
    }
}