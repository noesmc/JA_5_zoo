package fish;

import actions.Move;

import java.util.Calendar;

public abstract class Fish implements Move {
    protected String kind;
    protected String colour;
    protected int yearOfBirth;

    public Fish(String colour, int yearOfBirth) {
        this.kind = getClass().getSimpleName();
        this.colour = colour;
        this.yearOfBirth = yearOfBirth;
    }

    public String getKind() {
        return kind;
    }

    public static int getYear() {
        int year;
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        return year;
    }

    public void move() {
        System.out.printf("%s move around using their powerful tails to swim. ", getKind());
    }

    public void getInfo() {
        System.out.printf("The kind is \"%s\", %s's colour is %s. He is %d years old. ",
            kind,
            kind,
            colour,
            getYear() - yearOfBirth);
    }
}
