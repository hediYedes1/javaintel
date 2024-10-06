package classpr;

import classes.Zoo;
import classes.Animal;
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("cats", "lion", 3, true);
        Animal zebra = new Animal("zebra", "zebra", 3, true);
        Animal elephant = new Animal("elephant", "elephant", 3, true);
        Animal giraffe = new Animal("giraffe", "giraffe", 3, true);
        Animal monkey = new Animal("monkey", "monkey", 3, true);
        Animal tiger = new Animal("tiger", "tiger", 3, true);

        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo myZoo1 = new Zoo("Frigya", "Bouficha");

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        myZoo.addAnimal(zebra);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(monkey);

        System.out.println(myZoo);
        System.out.println("pos: " + myZoo.searchAnimal(lion.getName()));
        System.out.println("pos: " + myZoo.searchAnimal(giraffe.getName()));

        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion); // Tentative d'ajout de l'animal en double
        myZoo.addAnimal(tiger);

        myZoo.removeAnimal(monkey);
        System.out.println(myZoo);

        myZoo.isZooFull();
        System.out.println("Le zoo avec le plus grand nombre d'animaux est: " + Zoo.comparerZoo(myZoo, myZoo1));
    }
}