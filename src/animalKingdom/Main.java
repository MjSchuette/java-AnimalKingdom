package animalKingdom;

import java.util.*;

public class Main {
    public static void displayAnimals(ArrayList<Animals> animals, CheckAnimal tester) {
        for (Animals animal : animals) {
            if (tester.test(animal)) {
                System.out.println(animal.getName());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Animals> myAnimals = new ArrayList<Animals>();

        //Collections of animals
        //Mammals
        myAnimals.add(new Mammals("Panda", 1869));
        myAnimals.add(new Mammals("Zebra", 1778));
        myAnimals.add(new Mammals("Koala", 1816));
        myAnimals.add(new Mammals("Sloth", 1804));
        myAnimals.add(new Mammals("Armadillo", 1758));
        myAnimals.add(new Mammals("Raccoon", 1758));
        myAnimals.add(new Mammals("BigFoot", 2021));

        //Birds
        myAnimals.add(new Bird("Pigeon", 1837));
        myAnimals.add(new Bird("Peacock", 1821));
        myAnimals.add(new Bird("Toucan", 1758));
        myAnimals.add(new Bird("Parrot", 1824));
        myAnimals.add(new Bird("Swan", 1758));
    
        //Fish
        myAnimals.add(new Fish("Salmon", 1758));
        myAnimals.add(new Fish("Catfish", 1817));
        myAnimals.add(new Fish("Perch", 1758));

        //End collection
        // System.out.println(myAnimals);

        //List all the animals in descending order by year named
        System.out.println("*********************************Descending order by year named");
        myAnimals.sort((a1, a2) -> a1.getYearDiscovered() - a2.getYearDiscovered());
        myAnimals.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYearDiscovered()));

        //List all the animals alphabetically
        System.out.println("*********************************animals alphabetically");
        myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myAnimals.forEach(animal -> System.out.println(animal.getName()));

        //List all the animals order by how they move
        System.out.println("*********************************Animals by movement");
        myAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myAnimals.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

        //List only those animals the breath with lungs
        System.out.println("*********************************Animals with lungs");
        displayAnimals(myAnimals, animal -> animal.breathe().equals("lungs"));

        //List only those animals that breath with lungs and were named in 1758
        System.out.println("*********************************Animals with lungs named in 1758");
        displayAnimals(myAnimals, animal -> animal.breathe().equals("lungs") && animal.getYearDiscovered() == 1758);

        //List only those animals that lay eggs and breath with lungs
        System.out.println("*********************************Lays eggs and has lungs");
        displayAnimals(myAnimals, animal -> animal.breathe().equals("lungs") && animal.reproduce().equals("eggs"));

        //List alphabetically only those animals that were named in 1758
        System.out.println("*********************************Named in 1758 alphabetically");
        myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        displayAnimals(myAnimals, animal -> animal.getYearDiscovered() == 1758);

    }
}