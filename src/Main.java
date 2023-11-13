import animals.*;
import birds.*;
import fish.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        selectKind();
    }

    private static void selectKind() {

        Scanner scanner = new Scanner(System.in);

        Cat cat = new Cat(Cat.class.getSimpleName(), "Pure", "Black", 2017);
        Dog dog = new Dog(Dog.class.getSimpleName(), "Jack", "Black", 2018);
        Lion lion = new Lion(Lion.class.getSimpleName(), "Simba", "Black", 2020);
        Eagle eagle = new Eagle(Eagle.class.getSimpleName(), "Oasis", "Black", 2015);
        Gull gull = new Gull(Gull.class.getSimpleName(), "Bacchic", "Black", 2022);
        Ostrich ostrich = new Ostrich(Ostrich.class.getSimpleName(), "Mimi", "Grey", 2020);
        Chimera chimera = new Chimera(Chimera.class.getSimpleName(), "Black", 2017);
        Pike pike = new Pike(Pike.class.getSimpleName(), "Black", 2018);
        Shark shark = new Shark(Shark.class.getSimpleName(), "Black", 2020);

        int x;
        boolean exit = false;

        do {
            System.out.printf("""
                            Select the number of kind u want:
                            1. %s
                            2. %s
                            3. %s
                            4. Don't like anyone!
                            """,
                    Animals.class.getSimpleName(),
                    Birds.class.getSimpleName(),
                    Fish.class.getSimpleName());
            try {
                {
                    x = Integer.parseInt(scanner.next());
                    switch (x) {

                        case 1 -> {
                            System.out.printf("""
                                            Select a representative of the species "Animals":
                                            1. %s
                                            2. %s
                                            3. %s
                                            4. Back to selecting a species
                                            """,
                                    Cat.class.getSimpleName(),
                                    Dog.class.getSimpleName(),
                                    Lion.class.getSimpleName());
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
                                case 4 -> selectKind();
                                default -> System.out.println("Out of bound");
                            }
                        }

                        case 2 -> {
                            System.out.printf("""
                                            Select a representative of the species "Birds":
                                            1. %s
                                            2. %s
                                            3. %s
                                            4. Back to selecting a species
                                            """,
                                    Eagle.class.getSimpleName(),
                                    Gull.class.getSimpleName(),
                                    Ostrich.class.getSimpleName());
                            x = Integer.parseInt(scanner.next());
                            switch (x) {
                                case 1 -> {
                                    eagle.getInfo();
                                    eagle.movement();
                                    eagle.hunt();
                                    eagle.voice("Squeak-squeak");
                                }
                                case 2 -> {
                                    gull.getInfo();
                                    gull.movement();
                                    gull.voice("Aaaaaaaaa");
                                }
                                case 3 -> {
                                    ostrich.getInfo();
                                    ostrich.movement();
                                    ostrich.voice("Whoo-hoo");
                                }
                                case 4 -> selectKind();
                                default -> System.out.println("Out of bound");
                            }
                        }

                        case 3 -> {
                            System.out.printf("""
                                            Select a representative of the species Animals:
                                            1. %s
                                            2. %s
                                            3. %s
                                            4. Back to selecting a species
                                            """,
                                    Chimera.class.getSimpleName(),
                                    Pike.class.getSimpleName(),
                                    Shark.class.getSimpleName());
                            x = Integer.parseInt(scanner.next());
                            switch (x) {
                                case 1 -> {
                                    chimera.getInfo();
                                    chimera.movement();
                                }
                                case 2 -> {
                                    pike.getInfo();
                                    pike.movement();
                                }
                                case 3 -> {
                                    shark.getInfo();
                                    shark.movement();
                                }
                                case 4 -> selectKind();
                                default -> System.out.println("Out of bound");
                            }
                        }
                        case 4 -> {
                            exit = true;
                            System.out.println("You'll never be satisfied! :(");}
                        default -> System.out.println("Out of bound");
                    }
                    exit = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input!");
            }
        } while (!exit);
    }
}