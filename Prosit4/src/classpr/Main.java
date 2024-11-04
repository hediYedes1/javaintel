package classpr;

import classes.*;

public class Main {
    public static void main(String[] args)  {



        //Aquatic aqua = new Aquatic();
        Terrestrial terr = null ;
        try {
            terr=new Terrestrial("a","b" , 1 , false , 4);

        } catch (exep e) {
            System.out.println(e.getMessage());
        }
        Dolphin dol = null ;
        try {
            dol = new Dolphin("a","b" , 1 , false , "xx" , 0,0);

        } catch (exep e) {
            System.out.println(e.getMessage());
        }
        Penguin pen = null ;
        try {
            pen = new Penguin("a","b",5,true,"i",9);
        } catch (exep e) {
            System.out.println(e.getMessage());
        }

        Animal lion = null;
        Animal zebra = null;
        Animal elephant = null;
        Animal giraffe = null;
        Animal monkey = null;
        Animal tiger = null;

        try {


             lion = new Animal("cats", "lion", 3, true);
            zebra = new Animal("zebra", "zebra", 3, true);
            elephant = new Animal("elephant", "elephant", 3, true);
            giraffe = new Animal("giraffe", "giraffe", 3, true);
             monkey = new Animal("monkey", "monkey", 3, true);
             tiger = new Animal("tiger", "tiger", 3, true);

        }
        catch (exep e) {
            System.out.println(e.getMessage());
        }


        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo myZoo1 = new Zoo("Frigya", "Bouficha");

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        //System.out.println(aqua);
        //System.out.println(aqua.toString());

        System.out.println(terr);
        System.out.println(terr.toString());

        System.out.println(dol);
        System.out.println(dol.toString());

        System.out.println(pen);
        System.out.println(pen.toString());
try {
    myZoo.addAnimal(zebra);
    myZoo.addAnimal(elephant);
    myZoo.addAnimal(giraffe);
    myZoo.addAnimal(monkey);
    myZoo.addAnimal(lion);

    myZoo.addAnimal(tiger);
} catch (addexep e) {
    System.out.println(e.getMessage());
}


        System.out.println(myZoo);
        System.out.println("pos: " + myZoo.searchAnimal(lion.getName()));
        System.out.println("pos: " + myZoo.searchAnimal(giraffe.getName()));



        myZoo.removeAnimal(monkey);
        System.out.println(myZoo);

        myZoo.isZooFull();
        System.out.println("Le zoo avec le plus grand nombre d'animaux est: " + Zoo.comparerZoo(myZoo, myZoo1));

       // aqua.swim();
        dol.swim();
        pen.swim();
    }
}