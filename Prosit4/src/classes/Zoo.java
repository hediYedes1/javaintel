package classes;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name ;
    private String city;
    private final int nbrCages = 25 ;
    private final int nbrAquatics = 10 ;
    private int nbrAnimals ;
    private int nbrCurrentAquatics;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[this.nbrCages];
        this.nbrAnimals = 0;
        this.aquaticAnimals = new Aquatic[this.nbrAquatics];
    }
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void displayZoo() {
        System.out.println("Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Nbr Cages: " + this.nbrCages);
    }

    @Override
    public String toString() {
        String msg = "\nName: " + this.name + "\nCity: " + this.city + "\nNbr Cages: " + this.nbrCages + "\nAnimals:";
        for (int i = 0; i < this.nbrAnimals; i++) {
            msg += "\n" + (i + 1) + ". " + this.animals[i].toString();
        }
        return msg;
    }

    public Aquatic[] getAquaticAnimals() {
        return this.aquaticAnimals;
    }

    public int searchAnimal(String animalName) {
        for (int i = 0; i < this.nbrAnimals; i++) {
            if (this.animals[i].getName().equals(animalName)) {
                return i;
            }
        }
        return -1;
    }
    public void SetName(String name) {
        if(this.name == null || this.name.isEmpty()) {
            System.out.println("Name is null");
        }
        else {
            this.name = name;
        }

    }
/*
    public boolean addAnimal(Animal animal) {
        if (this.nbrAnimals >= this.nbrCages) {
            System.out.println("No more additions allowed!");
            return false;
        } else if (this.searchAnimal(animal.name) != -1) {
            System.out.println("Animal already exists!");
            return false;
        } else {
            this.animals[this.nbrAnimals] = animal;
            this.nbrAnimals++;
            System.out.println("Animal added");
            return true;
        }
    }

*/
/*
public boolean addAnimal(Animal animal) {
    if (this.isZooFull()) {
        System.out.println("No more additions allowed!");
        return false;
    } else if (this.searchAnimal(animal.getName()) != -1) {
        System.out.println("Animal already exists!");
        return false;
    } else {
        this.animals[this.nbrAnimals] = animal;
        this.nbrAnimals++;
        System.out.println("Animal added");
        return true;
    }
}*/


    public void addAnimal(Animal animal) throws addexep{

            if (this.isZooFull()) {
            throw new addexep("Zoo is full");
            }
                this.animals[this.nbrAnimals] = animal;
                this.nbrAnimals++;
                System.out.println("Animal added" + nbrAnimals + ".");



    }

    public boolean removeAnimal(Animal animal) {
        int index = this.searchAnimal(animal.getName());
        if (index == -1) {
            System.out.println("Animal not found!");
            return false;
        } else {
            for (int i = index; i < this.nbrAnimals - 1; i++) {
                this.animals[i] = this.animals[i + 1];
            }
            this.animals[this.nbrAnimals - 1] = null;
            this.nbrAnimals--;
            System.out.println("Animal removed");
            return true;
        }
    }

    public boolean isZooFull() {
        if (this.nbrAnimals == this.nbrCages) {
            System.out.println("Zoo is full!");
            return true;
        } else {
            return false;
        }
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("Both zoos have the same number of animals.");
            return null;
        }
    }
       public void addAquaticAnimal(Aquatic aquatic) {
           if (this.nbrCurrentAquatics >= this.nbrAquatics) {
               System.out.println("No more additions allowed!");
           } else {
               this.aquaticAnimals[this.nbrCurrentAquatics] = aquatic;
               this.nbrCurrentAquatics++;
               System.out.println("Aquatic animal added");
           }
       }
       /*
        public void swim()
           {
               for(int i = 0; i < this.nbrAquatics; i++) {
                   this.aquaticAnimals[i].swim();
               }
           }

        */
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1; // Initialiser à une valeur négative pour commencer

        // Parcourir les animaux aquatiques
        for (int i = 0; i < this.aquaticAnimals.length; i++) {
            if (this.aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) this.aquaticAnimals[i];
                float depth = penguin.getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }

        return maxDepth;
    }
    public void displayNumberOfAquaticsByType()
    {
        int a=0;
        int b=0;
        for (int i = 0; i < this.aquaticAnimals.length; i++)
        {
            if(this.aquaticAnimals[i] instanceof Penguin)
            {
                a++ ;
            } else if (this.aquaticAnimals[i] instanceof Dolphin) {
                b++ ;
            }
        }
    }
    }
