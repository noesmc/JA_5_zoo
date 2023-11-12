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

        Cat cat = new Cat(Cat.class.getSimpleName(), "Pure", "Black", 2017);
        Dog dog = new Dog(Cat.class.getSimpleName(), "Jack", "Black", 2018);
        Lion lion = new Lion(Cat.class.getSimpleName(), "Simba", "Black", 2020);
        Eagle eagle = new Eagle(Cat.class.getSimpleName(), "Oasis", "Black", 2015);
        Gull gull = new Gull(Cat.class.getSimpleName(), "Bacchic", "Black", 2022);
        Ostrich ostrich = new Ostrich(Cat.class.getSimpleName(), "Mimi", "Grey", 2020);
        Chimera chimera = new Chimera(Cat.class.getSimpleName(), "Black", 2017);
        Pike pike = new Pike(Cat.class.getSimpleName(), "Black", 2018);
        Shark shark = new Shark(Cat.class.getSimpleName(), "Black", 2020);

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
                            dog.track();
                            dog.voice("Wooooof");
                        }

                        case 3 -> {
                            lion.getInfo();
                            lion.movement();
                            lion.hunt();
                            lion.voice("Rrrrrrrr");
                        }
                        case 4 -> {
                            eagle.getInfo();
                            eagle.movement();
                            eagle.hunt();
                            eagle.voice("Squeak-squeak");
                        }

                        case 5 -> {
                            gull.getInfo();
                            gull.movement();
                            gull.voice("Aaaaaaaaa");
                        }

                        case 6 -> {
                            ostrich.getInfo();
                            ostrich.movement();
                            ostrich.voice("Whoo-hoo");
                        }
                        case 7 -> {
                            chimera.getInfo();
                            chimera.movement();
                        }

                        case 8 -> {
                            pike.getInfo();
                            pike.movement();
                        }

                        case 9 -> {
                            shark.getInfo();
                            shark.movement();
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
            Animals.class.getSimpleName().toUpperCase(),
            Cat.class.getSimpleName(),
            Dog.class.getSimpleName(),
            Lion.class.getSimpleName(),
            Birds.class.getSimpleName().toUpperCase(),
            Eagle.class.getSimpleName(),
            Gull.class.getSimpleName(),
            Ostrich.class.getSimpleName(),
            Fish.class.getSimpleName().toUpperCase(),
            Chimera.class.getSimpleName(),
            Pike.class.getSimpleName(),
            Shark.class.getSimpleName());
    }
}