package fish;

import actions.Actions;

import java.util.Calendar;

public abstract class Fish {
    protected String kind;
    protected String colour;
    protected int yearOfBirth;

    public Fish(String kind, String colour, int yearOfBirth) {
        this.kind = kind;
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

    public abstract void movement();

    public void getInfo() {
        System.out.printf("The kind is \"%s\", %s's colour is %s. He is %d. ",
                kind,
                kind,
                colour,
                getYear() - yearOfBirth);
    }
}
