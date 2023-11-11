import animals.*;
import birds.*;
import fish.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        chooseType();
    }

    private static void chooseType() {

        Scanner scanner = new Scanner(System.in);

        Cat cat = new Cat("Cat", "Pure", "Black", true, false);
        Dog dog = new Dog("Dog", "Jack", "Black", true, false);
        Lion lion = new Lion("Lion", "Simba", "Black", true, true);

        int x;
        boolean exit = false;

        do {
            printTypes();
            try {
                {
                    x = Integer.parseInt(scanner.next());
                    switch (x) {
                        case 1 -> {
                            cat.getInfo();
                            cat.movement();
                            cat.chaseAfterMice();
                            cat.voice("Meeeeeooow");
                        }

                        case 2 -> {
                            dog.getInfo();
                            dog.movement();
                            dog.voice("Wooooof");
                            dog.dogTrack();
                            dog.feed();
                        }

                        case 3 -> {
                            lion.getInfo();
                            lion.movement();
                            lion.voice("Rrrrrrrr");
                            lion.lionHunt();
                        }

                        default -> System.out.println("Out of bound");
                    }
                    exit = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input!");
            }
        } while (!exit);
    }

    private static void printTypes() {
        System.out.printf("""
                Choose the number of kind u want:
                %s
                1. %s,
                2. %s,
                3. %s,
                %s
                4. %s,
                5. %s,
                6. %s
                %s
                7. %s,
                8. %s,
                9. %s
                """,
            Animals.class.getPackageName().toUpperCase(),
            Cat.class.getSimpleName(),
            Dog.class.getSimpleName(),
            Lion.class.getSimpleName(),
            Birds.class.getPackageName().toUpperCase(),
            Eagle.class.getSimpleName(),
            Gull.class.getSimpleName(),
            Ostrich.class.getSimpleName(),
            Fish.class.getPackageName().toUpperCase(),
            Chimera.class.getSimpleName(),
            Pike.class.getSimpleName(),
            Shark.class.getSimpleName());
    }
}