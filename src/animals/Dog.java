package animals;

import java.util.Scanner;

public class Dog extends Animals {
    public Dog(String kind,String name, String colour, boolean tail, boolean mane) {
        super(kind, name, colour, tail, mane);
    }
    public void feed() {
        Scanner scanner = new Scanner((System.in));
        String feed;
        System.out.printf("What do u wanna give to %s? Meat or bones?", getName());
        feed = scanner.nextLine();
        System.out.printf("%s", feed.equalsIgnoreCase("meat") ?
                "Doesn't want meat, sorry :(" : (feed.equalsIgnoreCase("bones") ?
                "Bingo, just what she wanted!" : "You offer shit, doesn't want anything anymore."));
    }
}