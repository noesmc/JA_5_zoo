import animals.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cat cat = new Cat("Cat", "Pure", "Black", true, false);
        Dog dog = new Dog("Dog", "Jack", "Black", true, false);
        Lion lion = new Lion("Lion", "Simba","Black", true, true);

        int x;
        boolean exit = false;

        do {
            System.out.printf("""
                    Choose the number of kind u want:
                    1. %s,
                    2. %s,
                    3. %s
                    """, cat.getKind(), dog.getKind(), lion.getKind());
            try {
                {
                    x = Integer.parseInt(scanner.next());
                    switch (x) {
                        case 1 -> {
                            cat.getInfo();
                            cat.movement();
                            cat.voice("Meeeeeooow");
                        }

                        case 2 -> {
                            dog.getInfo();
                            dog.movement();
                            dog.voice("Wooooof");
                            dog.feed();
                        }

                        case 3 -> {
                            lion.getInfo();
                            lion.movement();
                            lion.voice("Rrrrrrrr");
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
}