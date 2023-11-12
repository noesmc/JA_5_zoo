package animals;

import java.util.Scanner;

public class Dog extends Animals {
    public Dog(String kind, String name, String colour, int yearOfBirth) {
        super(kind, name, colour, yearOfBirth);
    }

//    public void feed() {
//        Scanner scanner = new Scanner((System.in));
//        String feed;
//        System.out.printf("What do u wanna give to %s? Meat or bones?", getName());
//        feed = scanner.nextLine();
//        System.out.printf("%s", feed.equalsIgnoreCase("meat") ?
//                "Doesn't want meat, sorry :(" : (feed.equalsIgnoreCase("bones") ?
//                "Bingo, just what she wanted!" : "You offer shit, doesn't want anything anymore."));
//    }

    @Override
    public void movement() {
        System.out.printf("%s moves on four legs. ", getName());
    }

    @Override
    public void voice(String voice) {
        System.out.printf("Voices like \"%s\". ", voice);
    }

    public void track() {
        System.out.printf("%s can track the target. ", getName());
    }
}
