import animals.*;
import birds.*;
import fish.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            selectKind();
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input!");
        }
    }

    private static void selectKind() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("""
                Select the number of kind u want:
                1. %s
                2. %s
                3. %s
                4. Don't like anyone!
                """,
            Animal.class.getSimpleName(),
            Bird.class.getSimpleName(),
            Fish.class.getSimpleName());
        int number = Integer.parseInt(scanner.next());
        switch (number) {
            case 1 -> {
                selectRepresentative(number);
                bundleAnimals();
            }
            case 2 -> {
                selectRepresentative(number);
                bundleBirds();
            }
            case 3 -> {
                selectRepresentative(number);
                bundleFish();
            }
            case 4 -> System.out.println("You'll never be satisfied! :(");
            default -> System.out.println("Out of bound");
        }
    }

    private static void selectRepresentative(int number) {
        System.out.printf("""
                Select a representative of the species "Animals":
                1. %s
                2. %s
                3. %s
                4. Back to selecting kind
                """,
            (number == 1) ? "Cat" : (number == 2) ? "Eagle" : "Chimera",
            (number == 1) ? "Dog" : (number == 2) ? "Gull" : "Pike",
            (number == 1) ? "Lion" : (number == 2) ? "Ostrich" : "Shark");
    }

    private static void bundleAnimals() {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat("Pure", "Black", 2017);
        Dog dog = new Dog("Jack", "Black", 2018);
        Lion lion = new Lion("Simba", "Black", 2020);
        switch (Integer.parseInt(scanner.next())) {
            case 1 -> {
                cat.getInfo();
                cat.move();
                cat.chaseAfterMice();
                cat.voice("Meeeeeooow");
            }
            case 2 -> {
                dog.getInfo();
                dog.move();
                dog.track();
                dog.voice("Wooooof");
            }
            case 3 -> {
                lion.getInfo();
                lion.move();
                lion.hunt();
                lion.voice("Rrrrrrrr");
            }
            case 4 -> selectKind();
            default -> System.out.println("Out of bound");
        }
    }

    private static void bundleBirds() {
        Scanner scanner = new Scanner(System.in);
        Eagle eagle = new Eagle(Eagle.class.getSimpleName(), "Oasis", "Black", 2015);
        Gull gull = new Gull(Gull.class.getSimpleName(), "Bacchic", "Black", 2022);
        Ostrich ostrich = new Ostrich(Ostrich.class.getSimpleName(), "Mimi", "Grey", 2020);
        switch (Integer.parseInt(scanner.next())) {
            case 1 -> {
                eagle.getInfo();
                eagle.move();
                eagle.hunt();
                eagle.voice("Squeak-squeak");
            }
            case 2 -> {
                gull.getInfo();
                gull.move();
                gull.voice("Aaaaaaaaa");
            }
            case 3 -> {
                ostrich.getInfo();
                ostrich.move();
                ostrich.voice("Whoo-hoo");
            }
            case 4 -> selectKind();
            default -> System.out.println("Out of bound");
        }
    }

    private static void bundleFish() {
        Scanner scanner = new Scanner(System.in);
        Chimera chimera = new Chimera(Chimera.class.getSimpleName(), "Black", 2017);
        Pike pike = new Pike(Pike.class.getSimpleName(), "Black", 2018);
        Shark shark = new Shark(Shark.class.getSimpleName(), "Black", 2020);
        switch (Integer.parseInt(scanner.next())) {
            case 1 -> {
                chimera.getInfo();
                chimera.move();
            }
            case 2 -> {
                pike.getInfo();
                pike.move();
            }
            case 3 -> {
                shark.getInfo();
                shark.move();
            }
            case 4 -> selectKind();
            default -> System.out.println("Out of bound");
        }
    }
}